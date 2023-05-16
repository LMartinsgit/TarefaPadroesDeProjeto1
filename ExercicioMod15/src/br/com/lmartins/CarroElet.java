package br.com.lmartins;

public class CarroElet extends Carro {
    public CarroElet(String modelo, String motor, String cambio, String cor, String marca) {
        super(modelo, motor, cambio, cor, marca);
    }
    
    public void verificarEscolha() {
        System.out.println("\nMarca: " + marca + "\nModelo: " + modelo + "\nMotor: " + motor + "\nCâmbio: " + cambio + "\nCor: " + cor + ".\n");
    }
    
    public void verificarMecanica() {
        System.out.println("O motor de " + motor + " foi verificado pelo mecânico e está perfeito!");
    }

    public void verificarHigiene() {
        System.out.println("O " + marca + " está limpo e higienizado!");
    }
    
    public void verificarTudo() {
        System.out.println("O " + modelo + " está pronto para ser entregue!");
    }
}