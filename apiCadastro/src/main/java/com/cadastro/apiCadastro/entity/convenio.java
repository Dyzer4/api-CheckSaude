package com.cadastro.apiCadastro.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "convenios")
public class convenio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idConvenio;
	private String telefoneConvenio;
	private String emailConvenio;
	private String nomeConvenio;

	public convenio() {

	}

	public convenio(int idConvenio, String telefoneConvenio, String emailConvenio, String nomeConvenio) {
		this.idConvenio = idConvenio;
		this.telefoneConvenio = telefoneConvenio;
		this.emailConvenio = emailConvenio;
		this.nomeConvenio = nomeConvenio;
	}

	public int getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	public String getTelefoneConvenio() {
		return telefoneConvenio;
	}

	public void setTelefoneConvenio(String telefoneConvenio) {
		this.telefoneConvenio = telefoneConvenio;
	}

	public String getEmailConvenio() {
		return emailConvenio;
	}

	public void setEmailConvenio(String emailConvenio) {
		this.emailConvenio = emailConvenio;
	}

	public String getNomeConvenio() {
		return nomeConvenio;
	}

	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}

	

}