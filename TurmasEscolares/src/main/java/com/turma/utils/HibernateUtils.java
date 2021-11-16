package com.turma.utils;

import java.util.ArrayList;
import java.util.List;

import com.turma.dao.TurmaDAO;
import com.turma.models.Aluno;
import com.turma.models.Materia;
import com.turma.models.Professor;
import com.turma.models.Turma;

public class HibernateUtils {
	
	public static void main(String[] args) {
		
		String prefix = "77";
		
		Turma turma = new Turma();
		turma.setTitulo("Turma-"+prefix);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Eduardo-"+prefix);
		aluno.setSobrenome("Jose-"+prefix);
		aluno.setTurma(turma);
		
		Professor prof = new Professor();
		prof.setNome("Prof-"+prefix);
		
		Materia materia = new Materia();
		materia.setTitulo("Matematica-"+prefix);
		
		prof.setMateria(materia);
		
		List<Aluno> alunoList = new ArrayList<>(); //LIST Aluno
		alunoList.add(aluno);
		
		materia.setProfessores(prof);
		
		List<Professor> profList = new ArrayList<>(); //LIST Professor
		profList.add(prof);
		
		List<Turma> turmaList = new ArrayList<>(); //LIST Turma
		turmaList.add(turma);
		
		prof.setTurmas(turmaList);
		
		turma.setProfessores(profList);
		
		turma.setAlunos(alunoList);
		
		//TurmaDAO.save(turma);
		
		Turma a = TurmaDAO.findByPk(16L);
		a.getAlunos().forEach(b -> {
			System.out.println("Nome: "+b.getNome());
		});


	}
}
