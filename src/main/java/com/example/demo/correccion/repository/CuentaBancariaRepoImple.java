package com.example.demo.correccion.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.correccion.modelo.CuentaBancari;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CuentaBancariaRepoImple implements ICuentaBancariaRepos {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancari bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);

	}

	@Override
	public void actualizar(CuentaBancari bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
	}

	@Override
	public CuentaBancari buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancari.class, numero);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		CuentaBancari bancaria=this.buscar(numero);
		this.entityManager.remove(bancaria);

	}

}
