package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Transferencia;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class Prueba1PaP3ScApplication implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//primera parte
		
		CuentaBancaria bancaria1 =new CuentaBancaria();
		bancaria1.setCedula("1727490953");
		bancaria1.setNumero("123");
		bancaria1.setSaldo(new BigDecimal(100));
		bancaria1.setTipo("ahorros");
		
		this.iCuentaBancariaService.crear(bancaria1);
		
		CuentaBancaria bancaria2 =new CuentaBancaria();
		bancaria2.setCedula("1727490952");
		bancaria2.setNumero("456");
		bancaria2.setSaldo(new BigDecimal(200));
		bancaria2.setTipo("ahorros");
		
		this.iCuentaBancariaService.crear(bancaria2);
		
		//parte dos
		
		this.iTransferenciaService.realizar("123", "456", new BigDecimal(50));
		
		//parte tres
		
		CuentaBancaria bancaria3=this.iCuentaBancariaService.conseguir("123");
		System.out.println("El saldo de la cuenta bancaria: " + bancaria3.getNumero() +"es: "+bancaria3.getSaldo());

		
	}

}
