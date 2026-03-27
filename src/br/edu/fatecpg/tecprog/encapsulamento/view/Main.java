package br.edu.fatecpg.tecprog.encapsulamento.view;
import br.edu.fatecpg.tecprog.encapsulamento.model.*;

public class Main {

    public static void main (String [] args){

        // CARRO
        Carro carro = new Carro("Hyundai", "HB20",50, 25);

        System.out.println(carro.verificaCombustivel());

        carro.abastecer(15.4);
        System.out.println(carro.verificaCombustivel());

        carro.abastecer(20.3);
        System.out.println(carro.verificaCombustivel());

        // CONTA BANCÁRIA
        ContaBancaria conta = new ContaBancaria("09875643", "Kauan", 5427.27);

        System.out.printf("\nNome do titular: %s", conta.getTitular());
        conta.setTitular("Alfredo");
        System.out.printf("\nNome do titular: %s", conta.getTitular());

        conta.sacar(6000.00);
        conta.depositar(2000);
        conta.sacar(3000);
        conta.sacar(4340.00);
        conta.sacar(9000.00);
    }
}
