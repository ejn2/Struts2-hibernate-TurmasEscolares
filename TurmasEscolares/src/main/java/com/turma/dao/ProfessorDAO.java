package com.turma.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.turma.models.Professor;

public class ProfessorDAO {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private static EntityManager manager;
	
	
	//SAVE AND UPDATE
	public static Professor save(Professor professor) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			
			if(professor.getId() != null) {
				manager.merge(professor);
				
			}else {
				manager.persist(professor);
				
			}
			
			manager.getTransaction().commit();
			
		}catch(Exception ex) {
			manager.getTransaction().rollback();
			ex.printStackTrace();
			
		}finally{
			manager.close();
		}
		
		return professor;
		
	}
	
	
	//DELETE
	public static void remove(Long id) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.createQuery("delete from Professor where id = :id")
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
