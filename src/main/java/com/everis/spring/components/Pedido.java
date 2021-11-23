package com.everis.spring.components;

import org.springframework.stereotype.Component;

@Component
public class Pedido {
	
	public long identificador;
	public String destinatario;
	public String direccion;
	public Boolean fueraPeninsula;
	
	public Pedido(long identificador,String destinatario,String direccion,Boolean fueraPeninsula) {
		this.identificador = identificador;
		this.destinatario = destinatario;
		this.direccion = direccion;
		this.fueraPeninsula = fueraPeninsula;
	}

}
