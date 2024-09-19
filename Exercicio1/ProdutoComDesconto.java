package Exercicio1;

public class ProdutoComDesconto {

    private String nome;
    private double preco;
    private double desconto;

    ProdutoComDesconto() {

    }
    ProdutoComDesconto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoComDesconto() {
        return this.preco - (this.preco * this.desconto / 100);
    }

    public void aplicarDesconto(double novoDesconto) {
        this.desconto = novoDesconto;
    }


    public String toString(){
        return "Nome: " + getNome() + "\nPreço com desconto: R$ " + calcularPrecoComDesconto();
    }
}
