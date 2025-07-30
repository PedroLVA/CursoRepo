package poo1.aula29_07.desafio;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        if (preco < 0 || estoque < 0) {
            throw new IllegalArgumentException("Preço e estoque não podem ser negativos.");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a ser adicionada deve ser maior que zero.");
        }
        this.estoque += quantidade;
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a ser vendida deve ser maior que zero.");
        }

        if (this.estoque < quantidade) {
            throw new IllegalStateException("Estoque insuficiente. Estoque atual: " + this.estoque);
        }
        this.estoque -= quantidade;
    }

    public void exibirResumo() {
        System.out.println("--- Resumo do Produto ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println("Quantidade em Estoque: " + this.estoque + " unidades");
        System.out.println("-------------------------");
    }

}
