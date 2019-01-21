package com.bios.carro.impl;

import com.bios.carro.CarroPopular;

public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\n"
				+ "Fábrica: Ford\n"
				+ "Categoria: Popular");
	}

}
