package com.bios.carro.impl;

import com.bios.carro.CarroSedan;

public class FiestaSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta\n"
				+ "F�brica: Ford\n"
				+ "Categoria: Sedan");
	}

}
