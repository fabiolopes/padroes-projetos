package com.bios.factory.impl;

import com.bios.carro.CarroPopular;
import com.bios.carro.CarroSedan;
import com.bios.carro.impl.Fiesta;
import com.bios.carro.impl.FiestaSedan;
import com.bios.factory.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criaCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criaCarroPopular() {
		return new Fiesta();
	}

}
