package com.example.demo.service;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void crear(CuentaBancaria bancaria);

	public void actualizar(CuentaBancaria bancaria);

	public CuentaBancaria conseguir(String numero);

	public void eliminar(String numero);
}
