package aula28_07.exercicio2;

// Arquivo: Pedido.java
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();


    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }


    public double calcularTotal() {
        double total = 0.0;

        for (ItemPedido item : this.itens) {
            total += item.getPrecoTotal();
        }
        return total;
    }


    public void mostrarResumo() {
        System.out.println("--- Resumo ---");
        if (itens.isEmpty()) {
            System.out.println("O pedido está vazio");
            return;
        }
        for (ItemPedido item : this.itens) {
            System.out.println(item);
        }
        System.out.println("-------------------------");
        System.out.printf("VALOR TOTAL DO PEDIDO: R$ %.2f\n", calcularTotal());
        System.out.println("-------------------------");
    }
}
