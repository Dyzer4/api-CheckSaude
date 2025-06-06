package com.cadastro.apiCadastro.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@jakarta.persistence.Entity
@Table(name = "usuario") 
public class login implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    private int idUsuario;
    private String emailUsuario;
    private String senha;


    public login() {
    	
    }

    public login(String emailUsuario, String senha) {
        this.emailUsuario = emailUsuario;
        this.senha = senha;
    }

    public int getId() {
        return idUsuario;
    }

    public void setId(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return emailUsuario;
    }

    public void setEmail(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}