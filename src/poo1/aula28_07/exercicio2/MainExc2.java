package poo1.aula28_07.exercicio2;

public class MainExc2 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook Gamer", 4800.00);
        Produto p2 = new Produto("Mouse Logitech Ergonomico", 249.90);


        ItemPedido item1 = new ItemPedido(p1, 1); // 1 Notebook
        ItemPedido item2 = new ItemPedido(p2, 2); // 2 Mouses

        Pedido meuPedido = new Pedido();


        meuPedido.adicionarItem(item1);
        meuPedido.adicionarItem(item2);

        meuPedido.mostrarResumo();
    }
}
