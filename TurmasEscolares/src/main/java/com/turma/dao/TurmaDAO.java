package com.turma.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.turma.models.Turma;

public class TurmaDAO {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private static EntityManager manager;
	
	//FIND ALL
	public static List<Turma> findAll() {
		manager = factory.createEntityManager();
		List<Turma> turma = null;
		
		try {
			turma = manager.createQuery("from Turma").getResultList();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}finally {
			manager.close();
		}
		
		return turma;
		
	}
	
	//FIND BY PK
	public static Turma findByPk(Long pk) {
		manager = factory.createEntityManager();
		Turma turma = null;
		
		try {
			turma = manager.find(Turma.class, pk);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			manager.close();
			
		}
		
		return turma;
		
		
	}
	
	//SAVE AND UPDATE
	public static Turma save(Turma turma) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			
			if(turma.getId() != null) {
				manager.merge(turma);
				
			}else {
				manager.persist(turma);
				
			}
			
			manager.getTransaction().commit();
			
		}catch(Exception ex) {
			manager.getTransaction().rollback();
			ex.printStackTrace();
			
		}finally{
			manager.close();
		}
		
		return turma;
		
	}
	
	//DELETE
	public static void remove(Long id) {
		manager = factory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.createQuery("delete from Turma where id = :id")
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
