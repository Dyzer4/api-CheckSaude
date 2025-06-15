package com.cadastro.apiCadastro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apiCadastro.repository.ExameRepository;

@RestController
@RequestMapping("/api/exames")
public class ExameController {

    private final ExameRepository exameRepository;

    public ExameController(ExameRepository exameRepository) {
        this.exameRepository = exameRepository;
    }

    @GetMapping("/{id}")
    public List<String> getExamesPorConvenio(@PathVariable("id") int idConvenio) {
        return exameRepository.findExamesByConvenioId(idConvenio);
    }
}
