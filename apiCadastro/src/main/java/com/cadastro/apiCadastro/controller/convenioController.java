package com.cadastro.apiCadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apiCadastro.entity.Convenio;
import com.cadastro.apiCadastro.repository.convenioRepository;

@RestController
@RequestMapping("api/convenios")
public class convenioController {
	
	@Autowired
	private convenioRepository repoConvenio;
	
	@PostMapping
	public Convenio criarAgendamento(@RequestBody Convenio convenio) {
		return repoConvenio.save(convenio);
	}
	
	
	@GetMapping
	public List<Convenio> listarAgendamentos(){
		return repoConvenio.findAll();
	}
	
	
	@GetMapping("/{idConvenio}")
	public Convenio pesquisarAgendamentos(@PathVariable int idConvenio) {
		return repoConvenio.findById(idConvenio).orElse(null);
	}
}
