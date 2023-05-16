package br.com.lmartins;

public interface AbstractFactory {
	   Carro criarCarro(String modelo, String motor, String cambio, String cor, String marca);
	    Carro criarCarroEletrico(String modelo, String motor, String cambio, String cor, String marca);
	}