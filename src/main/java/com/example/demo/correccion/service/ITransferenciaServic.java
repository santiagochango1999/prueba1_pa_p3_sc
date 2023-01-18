package com.example.demo.correccion.service;

import java.math.BigDecimal;

public interface ITransferenciaServic {

	public void realizar(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
}
