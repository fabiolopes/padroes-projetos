package com.bios.carro.impl;

import com.bios.carro.CarroPopular;

public class Palio implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Palio\n"
				+ "Fábrica: Fiat\n"
				+ "Categoria: Popular");

	}

}
