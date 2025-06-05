package com.cadastro.apiCadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apiCadastro.entity.usuario;
import com.cadastro.apiCadastro.repository.usuarioRepository;

@RestController
@RequestMapping("api/usuarios")
public class usuarioController {
	
	@Autowired
	private usuarioRepository repoUsers;
	
	@PostMapping
	public usuario criarUsuario(@RequestBody usuario usuario) {
		return repoUsers.save(usuario);
	}
	
	
	@GetMapping
	public List<usuario> listarUsuarios(){
		return repoUsers.findAll();
	}
	
	
	@GetMapping("/{idUsuario}")
	public usuario pesquisarUsuario(@PathVariable int idUsuario) {
		return repoUsers.findById(idUsuario).orElse(null);
	}
}
