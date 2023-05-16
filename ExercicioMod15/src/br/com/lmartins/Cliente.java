package br.com.lmartins;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a marca do carro você deseja? (Tesla / BMW)");
        String marca = scanner.nextLine();

        System.out.println("Qual a cor do carro? (preto/branco/azul/prata/chumbo)");
        String cor = scanner.nextLine();
        

        AbstractFactory carroFactory = null;

// TESLA
        if (marca.equalsIgnoreCase("Tesla")) {
            carroFactory = new CarroFactory();
            Carro carro = carroFactory.criarCarroEletrico("Model S", "450cv", "automático", cor, marca);
            carro.verificarEscolha();
            carro.verificarMecanica();
            carro.verificarHigiene();
            carro.verificarTudo();
// BMW
        } else if (marca.equalsIgnoreCase("BMW")) {
            carroFactory = new CarroFactory();
            System.out.println("Qual é o tipo de câmbio? (manual/automático)");
            String tipoCambio = scanner.nextLine();
            Carro carro;
            if (tipoCambio.equalsIgnoreCase("manual")) {
                carro = carroFactory.criarCarro("Série 1", "400cv", "manual", cor, marca);
            } else if (tipoCambio.equalsIgnoreCase("automatico") || tipoCambio.equalsIgnoreCase("automatico") || tipoCambio.equalsIgnoreCase("auto"))  {
                carro = carroFactory.criarCarro("Série 3", "600cv", "automático", cor, marca);
            } else {
                System.out.println("Tipo de câmbio inválido!");
                System.exit(0);
                return;
            }
            
            carro.verificarEscolha();
            carro.verificarMecanica();
            carro.verificarHigiene();
            carro.verificarTudo();
            
        } else {
            System.out.println("Marca de carro inválida!");
            System.exit(0);
            return;
        }

        scanner.close();
    }
    
}

