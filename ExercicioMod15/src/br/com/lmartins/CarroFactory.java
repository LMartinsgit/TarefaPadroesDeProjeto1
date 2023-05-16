package br.com.lmartins;

public class CarroFactory implements AbstractFactory {
	  public Carro criarCarro(String modelo, String motor, String cambio, String cor, String marca) {
	        return new CarroMec(modelo, motor, cambio, cor, marca);
	    }

	    public Carro criarCarroEletrico(String modelo, String motor, String cambio, String cor, String marca) {
	        return new CarroElet(modelo, motor, cambio, cor, marca);
	    }
	}
