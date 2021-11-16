package com.turma.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.turma.models.Aluno;

public class AlunoDAO {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private static EntityManager manager;
	

	//SAVE AND UPDATE
	public static Aluno save(Aluno aluno) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			
			if(aluno.getId() != null) {
				manager.merge(aluno);
				
			}else {
				manager.persist(aluno);
				
			}
			
			manager.getTransaction().commit();
			
		}catch(Exception ex) {
			manager.getTransaction().rollback();
			ex.printStackTrace();
			
		}finally{
			manager.close();
		}
		
		return aluno;
		
	}
	
	//DELETE
	public static void remove(Long id) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.createQuery("delete from Aluno where id = :id")
				.setParameter("id", id)
				.executeUpdate();
			manager.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}finally {
			manager.close();
		}
	}
}
