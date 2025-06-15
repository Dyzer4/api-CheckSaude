package com.cadastro.apiCadastro.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    private String nomeCompleto;
    private String cpfUsuario;
    private String rgUsuario;
    private String enderecoUsuario;
    private String telefoneUsuario;
    private String emailUsuario;
    private String senha;
    private int idConvenio;
    private String dtaNascimento;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] foto;

    private String nomeArquivo;
    private String tipoArquivo;

    public usuario() {
    }

    public usuario(int idUsuario, String nomeCompleto, String cpfUsuario, String rgUsuario,
                   String enderecoUsuario, String telefoneUsuario, String emailUsuario,
                   String senha, int idConvenio, String dtaNascimento,
                   byte[] foto, String nomeArquivo, String tipoArquivo) {
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.cpfUsuario = cpfUsuario;
        this.rgUsuario = rgUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.senha = senha;
        this.idConvenio = idConvenio;
        this.dtaNascimento = dtaNascimento;
        this.foto = foto;
        this.nomeArquivo = nomeArquivo;
        this.tipoArquivo = tipoArquivo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getRgUsuario() {
        return rgUsuario;
    }

    public void setRgUsuario(String rgUsuario) {
        this.rgUsuario = rgUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConveio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getDtaNascimento() {
        return dtaNascimento;
    }

    public void setDtaNascimento(String dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }
}
