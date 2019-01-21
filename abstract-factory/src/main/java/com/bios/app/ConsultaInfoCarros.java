package com.bios.app;

import com.bios.carro.CarroPopular;
import com.bios.carro.CarroSedan;
import com.bios.factory.FabricaDeCarro;
import com.bios.factory.impl.FabricaFiat;
import com.bios.factory.impl.FabricaFord;

public class ConsultaInfoCarros {

	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criaCarroSedan();
		CarroPopular popular = fabrica.criaCarroPopular();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
		System.out.println();
		
		fabrica = new FabricaFord();
		sedan = fabrica.criaCarroSedan();
		popular = fabrica.criaCarroPopular();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
	}
	
}
