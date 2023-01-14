package com.example.demo.repository;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {

	public void insertar(CuentaBancaria bancaria);

	public void actualizar(CuentaBancaria bancaria);

	public CuentaBancaria buscar(String numero);

	public void borrar(String numero);
}
