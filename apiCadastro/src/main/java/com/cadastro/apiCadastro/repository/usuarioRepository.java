package com.cadastro.apiCadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.apiCadastro.entity.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Integer> {

}
