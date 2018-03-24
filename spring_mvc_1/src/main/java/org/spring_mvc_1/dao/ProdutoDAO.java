package org.spring_mvc_1.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.spring_mvc_1.model.ProdutoModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void grava(ProdutoModel produto){
		em.merge(produto);
	}
}
