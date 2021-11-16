package com.turma.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String titulo;
	
	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToOne
	private Professor professor;
	
	
	// -- GETTERS AND SETTERS

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Professor getProfessores() {
		return professor;
	}

	public void setProfessores(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", titulo=" + titulo + ", professores=" + professor + "]";
	}
	
	
}
