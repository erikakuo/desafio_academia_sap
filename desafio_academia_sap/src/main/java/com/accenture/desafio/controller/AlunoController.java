package com.accenture.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.desafio.entity.Aluno;
import com.accenture.desafio.service.AlunoService;

@RestController
@RequestMapping("/api")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping("/alunos")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.cadastrarAluno(aluno);
    }

    @GetMapping("/alunos")
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }
}