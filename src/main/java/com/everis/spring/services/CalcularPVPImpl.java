package com.everis.spring.services;

import org.springframework.stereotype.Service;

import com.everis.spring.components.Pedido;

@Service
public class CalcularPVPImpl implements CalcularPVP{

	@Override
	public double calcularPVP(double precioSinImpuesto,Boolean fueraPeninsula) {
		if(fueraPeninsula) {
			return precioSinImpuesto * 1.04;
		}
		else {
			return precioSinImpuesto * 1.21;
		}
		
	}

}
