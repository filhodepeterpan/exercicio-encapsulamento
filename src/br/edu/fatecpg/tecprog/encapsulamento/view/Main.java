package br.edu.fatecpg.tecprog.encapsulamento.view;
import br.edu.fatecpg.tecprog.encapsulamento.model.*;

public class Main {

    public static void main (String [] args){
        Carro carro = new Carro("Hyundai", "HB20",50, 25);

        System.out.println(carro.verificaCombustivel());

        carro.abastecer(15.4);
        System.out.println(carro.verificaCombustivel());

        carro.abastecer(20.3);
        System.out.println(carro.verificaCombustivel());
    }
}
