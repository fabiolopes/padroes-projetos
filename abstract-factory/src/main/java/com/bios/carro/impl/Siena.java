package com.bios.carro.impl;

import com.bios.carro.CarroSedan;

public class Siena implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo:Siena\n"
				+ "Fábrica: Fiat\n"
				+ "Categoria: Sedan");
	}

}
