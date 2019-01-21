package com.bios.factory;

import com.bios.carro.CarroPopular;
import com.bios.carro.CarroSedan;

public interface FabricaDeCarro {
	CarroSedan criaCarroSedan();
	CarroPopular criaCarroPopular();
}
