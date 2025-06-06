package com.cadastro.apiCadastro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "agendamentos")
public class agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAgendamento;
	private String dataExame;
	private String nomeExame;
	private int idHospitais;
	private int idUsuario;
	private int idConvenio;
	
	public agendamento() {
		
	}

	public agendamento(int idAgendamento, String dataExame, String nomeExame, int idHospitais, int idUsuario, int idConvenio) {
		this.idAgendamento = idAgendamento;
		this.dataExame = dataExame;
		this.nomeExame = nomeExame;
		this.idHospitais = idHospitais;
		this.idUsuario = idUsuario;
		this.idConvenio = idConvenio;
	}

	public int getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public String getDataExame() {
		return dataExame;
	}

	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public int getIdHospitais() {
		return idHospitais;
	}

	public void setIdHospitais(int idHospitais) {
		this.idHospitais = idHospitais;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}
	
	
}