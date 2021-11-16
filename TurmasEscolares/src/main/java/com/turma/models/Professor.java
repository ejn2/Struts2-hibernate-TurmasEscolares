package com.turma.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String nome;
	
	@ManyToMany
		@JoinTable(name = "Turma_Professor",  
		joinColumns = @JoinColumn(name="professor_id"),
		inverseJoinColumns = @JoinColumn(name="turma_id"))
	private List<Turma> turmas;
	
	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToOne(mappedBy = "professor", cascade = CascadeType.ALL)
	@JoinColumn(name = "professor_id")
	private Materia materia;

	
	// -- GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}



	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", turmas=" + turmas + ", materias=" + materia + "]";
	}

}
