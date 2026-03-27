package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private double capacidadeTanque;
    private double tanque;

    public Carro(String marca, String modelo, double capacidadeTanque, double tanque){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.tanque = tanque;
    }

    // GETTERS E SETTERS
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public double getCapacidadeTanque() { return capacidadeTanque; }

    public double getTanque() { return tanque; }

    // OUTROS MÉTODOS

    private double combustivelFaltando(){
        return this.capacidadeTanque - tanque;
    }

    public String verificaCombustivel(){
        int porcentagem = (int)((tanque / capacidadeTanque) * 100);

        return "\nCombustível atual: %.2fL \nCombustível que pode ser abastecido: %.2fL \n%d%% cheio!\n"
                .formatted(this.tanque, combustivelFaltando(), porcentagem);
    }

    public void abastecer(double combustivel){
        tanque += combustivelFaltando() > combustivel ? combustivel : combustivelFaltando();
    }
}
