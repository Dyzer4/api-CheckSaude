package com.cadastro.apiCadastro.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;


import com.cadastro.apiCadastro.entity.usuario;
import com.cadastro.apiCadastro.repository.usuarioRepository;

@RestController
@RequestMapping("api/usuarios")
public class usuarioController {
    
    @Autowired
    private usuarioRepository repoUsers;

    @PostMapping
    public ResponseEntity<String> criarUsuarioComFoto(
            @RequestParam String nomeCompleto,
            @RequestParam String cpfUsuario,
            @RequestParam String rgUsuario,
            @RequestParam String enderecoUsuario,
            @RequestParam String telefoneUsuario,
            @RequestParam String emailUsuario,
            @RequestParam String senha,
            @RequestParam int idConvenio,
            @RequestParam String dtaNascimento,
            @RequestParam("foto") MultipartFile file) {

        try {
            usuario usuario = new usuario();
            usuario.setNomeCompleto(nomeCompleto);
            usuario.setCpfUsuario(cpfUsuario);
            usuario.setRgUsuario(rgUsuario);
            usuario.setEnderecoUsuario(enderecoUsuario);
            usuario.setTelefoneUsuario(telefoneUsuario);
            usuario.setEmailUsuario(emailUsuario);
            usuario.setSenha(senha);
            usuario.setIdConveio(idConvenio);
            usuario.setDtaNascimento(dtaNascimento);
            
            if (!file.isEmpty()) {
                usuario.setFoto(file.getBytes());
                usuario.setNomeArquivo(file.getOriginalFilename());
                usuario.setTipoArquivo(file.getContentType());
            }

            repoUsers.save(usuario);
            return ResponseEntity.ok("Usuário cadastrado com foto!");

        } catch (IOException e) {
            return ResponseEntity.internalServerError().body("Erro ao salvar a imagem.");
        }
    }

    @GetMapping
    public List<usuario> listarUsuarios() {
        return repoUsers.findAll();
    }

    @GetMapping("/{idUsuario}")
    public usuario pesquisarUsuario(@PathVariable int idUsuario) {
        return repoUsers.findById(idUsuario).orElse(null);
    }
    
    @GetMapping("/{idUsuario}/foto")
    public ResponseEntity<byte[]> exibirFoto(@PathVariable int idUsuario) {
        return repoUsers.findById(idUsuario)
            .filter(usuario -> usuario.getFoto() != null)
            .map(usuario -> {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.parseMediaType(usuario.getTipoArquivo()));
                return new ResponseEntity<>(usuario.getFoto(), headers, HttpStatus.OK);
            })
            .orElse(ResponseEntity.notFound().build());
    }
}
