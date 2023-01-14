package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="transferencia")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tran_seq")
    @SequenceGenerator(name = "tran_seq", sequenceName = "tran_seq", allocationSize = 1)
	@Column(name="tran_id")
	private Integer id;
	@Column(name="tran_fechadetransferencia")
	private LocalDateTime fechaDeTransferencia;
	@Column(name="tran_numerocuentaorigen")
	private String numeroCuentaOrigen;
	@Column(name="tran_numerocuentadestino")
	private String numeroCuentaDestino;
	@Column(name="tran_monto")
	private BigDecimal monto;
	@Column(name="tran_comision")
	private BigDecimal comision;
	public Integer getId() {
		return id;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fechaDeTransferencia=" + fechaDeTransferencia + ", numeroCuentaOrigen="
				+ numeroCuentaOrigen + ", numeroCuentaDestino=" + numeroCuentaDestino + ", monto=" + monto
				+ ", comision=" + comision + "]";
	}




	//METODOS GET Y SET
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechaDeTransferencia() {
		return fechaDeTransferencia;
	}
	public void setFechaDeTransferencia(LocalDateTime fechaDeTransferencia) {
		this.fechaDeTransferencia = fechaDeTransferencia;
	}
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	

}
