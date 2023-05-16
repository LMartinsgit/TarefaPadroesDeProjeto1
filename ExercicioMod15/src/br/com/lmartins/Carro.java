package br.com.lmartins;

public abstract class Carro {
	
    protected String modelo;
    protected String motor;
    protected String cambio;
    protected String cor;
    protected String marca;
    
    public Carro(String modelo, String motor, String cambio, String cor, String marca) {
        this.modelo = modelo;
        this.motor = motor;
        this.cambio = cambio;
        this.cor = cor;
        this.marca = marca;
        
    }
    
    public abstract void verificarEscolha();
    public abstract void verificarMecanica();
    public abstract void verificarHigiene();
    public abstract void verificarTudo();
    
}

