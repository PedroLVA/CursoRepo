package poo1.aula28_07.exercicio2;


import java.util.ArrayList;
import java.util.List;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Item: %s | Quantdade: %d | subtotal: R$ %.2f",
                produto.getNome(), quantidade, getPrecoTotal());
    }
}