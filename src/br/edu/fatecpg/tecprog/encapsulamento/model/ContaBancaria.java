package br.edu.fatecpg.tecprog.encapsulamento.model;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // GETTERS E SETTERS

    public String getNumeroConta() { return numeroConta; }

    public double getSaldo() { return saldo; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    //OUTROS MÉTODOS
    public void depositar(double valor){
        this.saldo += valor;
        status();
    }

    public void sacar (double valor){
        if (this.saldo < valor) { System.out.println(saqueInvalido()); }
        this.saldo -= this.saldo >= valor ? valor : 0;

        status();
    }

    private String saqueInvalido(){
        return "\nSaque inválido. Por favor, tente novamente.\n";
    }

    public void status(){
        System.out.printf("""
                \n-- BANCO DIGITAL --
                Nº da Conta: %s
                Titutlar: %s
                Saldo: %.2f
                """, this.numeroConta, this.titular, this.saldo);
    }
}
