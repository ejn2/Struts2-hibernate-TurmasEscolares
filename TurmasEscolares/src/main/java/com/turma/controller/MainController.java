package com.turma.controller;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.turma.dao.ProfessorDAO;
import com.turma.dao.TurmaDAO;
import com.turma.models.Aluno;
import com.turma.models.Materia;
import com.turma.models.Professor;
import com.turma.models.Turma;


public class MainController extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Long id; //Parâmetro

	private List<Professor> profList = new ArrayList<>();
	private List<Aluno> alunoList = new ArrayList<>();
	private List<Turma> turmaList = new ArrayList<>();
	
	private Professor prof = new Professor();
	private Aluno aluno = new Aluno();
	private Turma turma = new Turma();
	private Materia materia = new Materia();

	
	public String homePage() {
		this.turmaList = TurmaDAO.findAll(); //Lista todas as turmas.
		return SUCCESS;
	}
	
	
	public String turmaInfo() {
		this.turma = TurmaDAO.findByPk(this.id);
		return SUCCESS;
	}
	
	
	public String save() {
		
		this.prof.setMateria(this.materia);
		this.aluno.setTurma(this.turma);

		//RELACIONAMENTOS ENTRE ENTIDADES
		
		this.alunoList.add(this.aluno); //LISTA DE ALUNO
		this.materia.setProfessores(this.prof);
		
		
		this.profList.add(this.prof); //LISTA DE PROFESSOR
		this.turmaList.add(turma); //LISTA DE TURMAS
		
		
		this.prof.setTurmas(this.turmaList);
		this.turma.setProfessores(this.profList);
		
		this.turma.setAlunos(this.alunoList);
	
		TurmaDAO.save(this.turma); //SALVAR TURMA
		
		return SUCCESS;
		
	}
	

	public String remover() {
		TurmaDAO.remove(this.id);
		ProfessorDAO.remove(this.id);
		return SUCCESS;
	}
	
	
	//=== GETTERS AND SETTERS ====

	public Professor getProf() {
		return prof;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	// === LIST ====
	
	public List<Turma> getTurmaList() {
		return turmaList;
		
	}

	public void setTurmaList(List<Turma> turmaList) {
		this.turmaList = turmaList;
	}

}
