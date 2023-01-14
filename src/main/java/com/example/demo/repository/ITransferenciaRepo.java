package com.example.demo.repository;

import com.example.demo.modelo.Transferencia;

public interface ITransferenciaRepo {

	public void insertar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public Transferencia buscar(Integer id);

	public void borrar(Integer id);
}
