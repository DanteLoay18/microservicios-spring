package TDB.MsSeguridad.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDB.MsSeguridad.repository.IAuthRepository;
import TDB.MsSeguridad.model.UsuarioModel;

@Service
public class AuthService {
    
    @Autowired
    IAuthRepository authRepository;

    public List<UsuarioModel> getAll() {
        return (List<UsuarioModel>) authRepository.findAll();
    }

    public Optional<UsuarioModel> findById(Integer id){
        return authRepository.findById(id);
    }

    public UsuarioModel createUsuario(UsuarioModel usuario){
        return authRepository.save(usuario);
    }

    public void deleteUsuario(UsuarioModel usuario){
        authRepository.delete(usuario);
    }

    public UsuarioModel actualizarUsuario(Integer id, UsuarioModel nuevoUsuario) {
        UsuarioModel usuarioExistente = authRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuarioExistente.setUsername(nuevoUsuario.getUsername());
        usuarioExistente.setPassword(nuevoUsuario.getPassword());

        return authRepository.save(usuarioExistente);
    }
    
}
