package com.cadastro.apiCadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.apiCadastro.entity.agendamento;

public interface agendamentoRepository extends JpaRepository<agendamento, Integer>  {
	

}
