package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // GETTERS E SETTERS
    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return this.preco; }
    public void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque () { return this.quantidadeEstoque; }
    public void setQuantidadeEstoque (int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

   public String comprar(int quantidade){
        if(validarCompra(quantidade)){
            this.quantidadeEstoque -= quantidade;
            return "\nCompra de %d %s(s) realizada com sucesso!\n"
                    .formatted(quantidade, this.nome);
       }
        return "Compra inválida! Verifique a quantidade em estoque.";
   }

   public boolean validarCompra(int quantidade) {
       return quantidade <= this.quantidadeEstoque;
   }

   @Override
    public String toString(){
        return
            """
            \n-- %s --
            Preço: R$%.2f
            Quantidade em Estoque: %s
            """.formatted(this.nome, this.preco, this.quantidadeEstoque > 0 ? this.quantidadeEstoque : "Esgotado");
   }
}
