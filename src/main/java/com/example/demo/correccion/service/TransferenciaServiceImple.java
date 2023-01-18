package com.example.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.CuentaBancari;
import com.example.demo.correccion.modelo.Transferenci;
import com.example.demo.correccion.repository.ITransferenciaRepos;

@Service
public class TransferenciaServiceImple implements ITransferenciaServic {

	@Autowired
	private ICuentaBancariaServic iCuentaBancariaService;

	@Autowired
	private ITransferenciaRepos iTransferenciaRepo;

	@Override
	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancari cuentaO = this.iCuentaBancariaService.conseguir(cuentaOrigen);
		CuentaBancari cuentaD = this.iCuentaBancariaService.conseguir(cuentaDestino);
		
		BigDecimal comision = monto.multiply(new BigDecimal(0.05));
		BigDecimal montoDebitar=monto.add(comision);

		if (montoDebitar.compareTo(cuentaO.getSaldo()) < 1) {
			
			// CUENTA ORIGEN
			cuentaO.setSaldo(cuentaO.getSaldo().subtract(montoDebitar));
			this.iCuentaBancariaService.actualizar(cuentaO);

			// CUENTA DESTINO
			cuentaD.setSaldo(cuentaD.getSaldo().add(monto));
			this.iCuentaBancariaService.actualizar(cuentaD);

			//TRANSFERENCIA
			Transferenci transferencia = new Transferenci();
			transferencia.setComision(comision);
			transferencia.setFechaDeTransferencia(LocalDateTime.now());
			transferencia.setMonto(monto);
			transferencia.setNumeroCuentaDestino(cuentaDestino);
			transferencia.setNumeroCuentaOrigen(cuentaOrigen);
			
			this.iTransferenciaRepo.insertar(transferencia);
			
		} else {
			System.out.println("NO SE PUEDE REALIZAR LA TRANSFERENCIA MONTO MAYOR AL DEL SALDO ORIGEN");
		}

	}

}
