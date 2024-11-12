package com.accenture.desafio.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import java.util.Date;
import lombok.Data;

@Entity
@Data
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao = new Date();

	@ManyToMany(mappedBy = "cursos")
	private Set<Aluno> alunos;

}