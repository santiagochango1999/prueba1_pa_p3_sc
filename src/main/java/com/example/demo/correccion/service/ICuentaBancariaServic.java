package com.example.demo.correccion.service;

import com.example.demo.correccion.modelo.CuentaBancari;

public interface ICuentaBancariaServic {

	public void crear(CuentaBancari bancaria);

	public void actualizar(CuentaBancari bancaria);

	public CuentaBancari conseguir(String numero);

	public void eliminar(String numero);
}
