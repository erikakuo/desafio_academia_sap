package com.accenture.desafio.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new Date();

	@ManyToMany
	@JoinTable(name = "Inscricao", joinColumns = @JoinColumn(name = "alunoId"), inverseJoinColumns = @JoinColumn(name = "cursoId"))
	private Set<Curso> cursos;
}