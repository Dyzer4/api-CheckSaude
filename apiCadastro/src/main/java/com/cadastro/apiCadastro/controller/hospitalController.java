package com.cadastro.apiCadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apiCadastro.entity.hospital;
import com.cadastro.apiCadastro.repository.hospitalRepository;

@RestController
@RequestMapping("api/hospitais")
public class hospitalController {
	
	@Autowired
	private hospitalRepository repoHospital;
	
	@PostMapping
	public hospital criarAgendamento(@RequestBody hospital hospital) {
		return repoHospital.save(hospital);
	}
	
	
	@GetMapping
	public List<hospital> listarAgendamentos(){
		return repoHospital.findAll();
	}
	
	
	@GetMapping("/{idHospital}")
	public hospital pesquisarAgendamentos(@PathVariable int idHospital) {
		return repoHospital.findById(idHospital).orElse(null);
	}
}