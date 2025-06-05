package com.cadastro.apiCadastro.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "hospitais")
public class hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idHospitais;
	private String nomeHospital;
	private String enderecoHospital;
	private String telefoneHospital;
	private String emailHospital;

	public hospital() {

	}

	public hospital(int idHospitais, String nomeHospital, String enderecoHospital, String telefoneHospital, String emailHospital) {
		this.idHospitais = idHospitais;
		this.nomeHospital = nomeHospital;
		this.enderecoHospital = enderecoHospital;
		this.telefoneHospital = telefoneHospital;
		this.emailHospital = emailHospital;
	}

	public int getIdHospitais() {
		return idHospitais;
	}

	public void setIdHospitais(int idHospitais) {
		this.idHospitais = idHospitais;
	}

	public String getNomeHospital() {
		return nomeHospital;
	}

	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}

	public String getEnderecoHospital() {
		return enderecoHospital;
	}

	public void setEnderecoHospital(String enderecoHospital) {
		this.enderecoHospital = enderecoHospital;
	}

	public String getTelefoneHospital() {
		return telefoneHospital;
	}

	public void setTelefoneHospital(String telefoneHospital) {
		this.telefoneHospital = telefoneHospital;
	}

	public String getEmailHospital() {
		return emailHospital;
	}

	public void setEmailHospital(String emailHospital) {
		this.emailHospital = emailHospital;
	}
	

}