package TDB.MsSeguridad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB.MsSeguridad.services.AuthService;

import TDB.MsSeguridad.model.UsuarioModel;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping
    public List<UsuarioModel> getAll() {
        return authService.getAll();
    }
}
