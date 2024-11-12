package com.accenture.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.desafio.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}