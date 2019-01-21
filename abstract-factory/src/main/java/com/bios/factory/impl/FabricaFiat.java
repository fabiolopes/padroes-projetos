package com.bios.factory.impl;

import com.bios.carro.CarroPopular;
import com.bios.carro.CarroSedan;
import com.bios.carro.impl.Palio;
import com.bios.carro.impl.Siena;
import com.bios.factory.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public CarroSedan criaCarroSedan() {
		return new Siena();
	}

	@Override
	public CarroPopular criaCarroPopular() {
		return new Palio();
	}

}
