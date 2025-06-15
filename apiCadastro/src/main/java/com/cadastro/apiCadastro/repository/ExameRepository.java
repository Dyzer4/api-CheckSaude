package com.cadastro.apiCadastro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cadastro.apiCadastro.entity.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Integer> {

	@Query("SELECT e.nomeExame FROM Exame e " +
		       "JOIN ConvenioExame ce ON ce.exame = e " +
		       "WHERE ce.convenio.idConvenio = :idConvenio")

		List<String> findExamesByConvenioId(@Param("idConvenio") int idConvenio);

}