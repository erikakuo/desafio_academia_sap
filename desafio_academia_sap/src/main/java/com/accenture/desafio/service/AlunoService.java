package com.accenture.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.desafio.entity.Aluno;
import com.accenture.desafio.repository.AlunoRepository;

@Service
public class AlunoService {

	    @Autowired
	    private AlunoRepository alunoRepository;

	    @Override
	    public Aluno cadastrarAluno(Aluno aluno) {
	        return alunoRepository.save(aluno);
	    }

	    @Override
	    public List<Aluno> listarAlunos() {
	        return alunoRepository.findAll();
	    }
	}
}
