package com.turma.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.turma.models.Materia;

public class MateriaDAO {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private static EntityManager manager;
	

	//SAVE AND UPDATE
	public static Materia save(Materia materia) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			
			if(materia.getId() != null) {
				manager.merge(materia);
				
			}else {
				manager.persist(materia);
				
			}
			
			manager.getTransaction().commit();
			
		}catch(Exception ex) {
			manager.getTransaction().rollback();
			ex.printStackTrace();
			
		}finally{
			manager.close();
		}
		
		return materia;
		
	}
	
	//DELETE
	public static void remove(Long id) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.createQuery("delete from Materia where id = :id")
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
