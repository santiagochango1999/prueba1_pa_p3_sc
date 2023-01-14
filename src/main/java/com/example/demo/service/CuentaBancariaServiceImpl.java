package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepo iCuentaBancariaRepo;

	@Override
	public void crear(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.insertar(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancaria conseguir(String numero) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.borrar(numero);
	}

}
