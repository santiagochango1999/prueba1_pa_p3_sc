package com.example.demo.correccion.repository;

import com.example.demo.correccion.modelo.CuentaBancari;

public interface ICuentaBancariaRepos {

	public void insertar(CuentaBancari bancaria);

	public void actualizar(CuentaBancari bancaria);

	public CuentaBancari buscar(String numero);

	public void borrar(String numero);
}
