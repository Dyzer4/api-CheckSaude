package com.cadastro.apiCadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apiCadastro.entity.agendamento;
import com.cadastro.apiCadastro.repository.agendamentoRepository;

@RestController
@RequestMapping("api/agendamentos")
public class agendamentoController {
	
	@Autowired
	private agendamentoRepository repoAgend;
	
	@PostMapping
	public agendamento criarAgendamento(@RequestBody agendamento agendamento) {
		return repoAgend.save(agendamento);
	}
	
	
	@GetMapping
	public List<agendamento> listarAgendamentos(){
		return repoAgend.findAll();
	}
	
	
	@GetMapping("/{idAgendamento}")
	public agendamento pesquisarAgendamentos(@PathVariable int idAgendamento) {
		return repoAgend.findById(idAgendamento).orElse(null);
	}
}
