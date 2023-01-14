package com.example.demo.service;

import java.awt.print.Printable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Transferencia;
import com.example.demo.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;

	@Override
	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria cuentaO = this.iCuentaBancariaService.conseguir(cuentaOrigen);
		CuentaBancaria cuentaD = this.iCuentaBancariaService.conseguir(cuentaDestino);

		if (monto.compareTo(cuentaO.getSaldo()) < 1) {
			// cuenta origen
			cuentaO.setSaldo(cuentaO.getSaldo().subtract(monto));
			this.iCuentaBancariaService.actualizar(cuentaO);

			// cuenta destino
			cuentaD.setSaldo(cuentaD.getSaldo().add(monto));
			this.iCuentaBancariaService.actualizar(cuentaD);

			BigDecimal c = (monto.multiply(new BigDecimal(5)).divide(new BigDecimal(100)));

			Transferencia transferencia = new Transferencia();
			transferencia.setComision(c);
			transferencia.setFechaDeTransferencia(LocalDateTime.now());
			transferencia.setMonto(monto);
			transferencia.setNumeroCuentaDestino(cuentaDestino);
			transferencia.setNumeroCuentaOrigen(cuentaOrigen);
		} else {
			System.out.println("NO SE PUEDE REALIZAR LA TRANSFERENCIA MONTO MAYOR AL DEL SALDO ORIGEN");
		}
		
		

	}

}
