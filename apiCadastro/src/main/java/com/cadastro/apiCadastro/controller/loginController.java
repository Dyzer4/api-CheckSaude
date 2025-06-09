package com.cadastro.apiCadastro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apiCadastro.entity.login;
import com.cadastro.apiCadastro.repository.loginRepository;

@RestController
@RequestMapping("api/usuarios")
public class loginController {
	@Autowired
    private loginRepository repoLogin;

    @GetMapping("/login")
    public ResponseEntity<?> validarLogin(@RequestParam String email, @RequestParam String senha) {
        Optional<login> usuarioOpt = repoLogin.findByEmailAndSenha(email, senha);

        if (usuarioOpt.isPresent()) {
            login usuario = usuarioOpt.get();
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("E-mail ou senha incorretos");
        }
    }

}
