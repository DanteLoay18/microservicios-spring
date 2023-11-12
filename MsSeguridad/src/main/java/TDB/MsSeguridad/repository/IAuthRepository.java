package TDB.MsSeguridad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import TDB.MsSeguridad.model.UsuarioModel;

@Repository
public interface IAuthRepository extends CrudRepository<UsuarioModel, Integer> {
    
}
