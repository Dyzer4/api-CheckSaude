package com.cadastro.apiCadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cadastro.apiCadastro.entity.login;

public interface loginRepository extends JpaRepository<login, Integer> {

    @Query("SELECT u FROM login u WHERE u.emailUsuario = :email AND u.senha = :senha")
    Optional<login> findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);
}