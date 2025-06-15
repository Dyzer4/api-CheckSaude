package com.cadastro.apiCadastro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exames")
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExame;

    @Column(name = "nome_exame")
    private String nomeExame;


	public Exame() {
		
	}
	
	public Exame(int idExame, String nomeExame) {
		this.idExame = idExame;
		this.nomeExame = nomeExame;
	}
    // Getters e setters

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	
    
}
