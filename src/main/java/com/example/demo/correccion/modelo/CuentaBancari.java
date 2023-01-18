package com.example.demo.correccion.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class CuentaBancari {
	
	@Id
	@Column(name="cuba_numero")
	private String numero;
	@Column(name="cuba_tipo")
	private String tipo;
	@Column(name="cuba_saldo")
	private BigDecimal saldo;
	@Column(name="cuba_cedula")
	private String cedula;
	
	
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedula=" + cedula + "]";
	}
	
	
	//METODOS GET Y SET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	

}
