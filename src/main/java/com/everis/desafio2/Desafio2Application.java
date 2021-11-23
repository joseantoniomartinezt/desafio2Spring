package com.everis.desafio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.spring.components.Pedido;
import com.everis.spring.components.Producto;
import com.everis.spring.services.CalcularPVP;


@SpringBootApplication
public class Desafio2Application implements CommandLineRunner{
	
	@Autowired
	private CalcularPVP calcularPVPService;
	
	@Autowired
	private Producto producto;
	
	@Autowired
	private Pedido pedido;

	public static void main(String[] args) {
		SpringApplication.run(Desafio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(calcularPVPService.calcularPVP(producto.precioSinImpuestos, pedido.fueraPeninsula));
		
	}

}
