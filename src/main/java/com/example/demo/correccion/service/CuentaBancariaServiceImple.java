package com.example.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.CuentaBancari;
import com.example.demo.correccion.repository.ICuentaBancariaRepos;

@Service
public class CuentaBancariaServiceImple implements ICuentaBancariaServic {

	@Autowired
	private ICuentaBancariaRepos iCuentaBancariaRepo;

	@Override
	public void crear(CuentaBancari bancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.insertar(bancaria);
	}

	@Override
	public void actualizar(CuentaBancari bancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancari conseguir(String numero) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.borrar(numero);
	}

}
