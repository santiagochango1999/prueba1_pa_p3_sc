package com.example.demo.correccion.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.correccion.modelo.Transferenci;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class TransferenciaRepoImple implements ITransferenciaRepos {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Transferenci transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

}
