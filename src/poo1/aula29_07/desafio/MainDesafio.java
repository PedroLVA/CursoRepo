package poo1.aula29_07.desafio;

public class MainDesafio {
    public static void main(String[] args) {
        Produto caneta = new Produto("Caneta Azul", 1.50, 10);
        caneta.exibirResumo();

        System.out.println("\n>>> Testando operações validas");
        try {
            caneta.adicionarEstoque(20);
            System.out.println("Estoque adicionado com sucesso");
            caneta.vender(5);
            System.out.println("Venda realizada com sucesso.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erro inesperado:  " + e.getMessage());
        }
        caneta.exibirResumo();


        System.out.println("\n--Testando venda com estoque insuficiente--");
        try {
            caneta.vender(50); // Deve falha
        } catch (IllegalStateException e) {
            System.err.println("Falha ao vender: " + e.getMessage());
        }
        caneta.exibirResumo();


        System.out.println("\n>>> Testando adicionar estoque com quantidade negativa");
        try {
            caneta.adicionarEstoque(-5); // Deve falhar
        } catch (IllegalArgumentException e) {
            System.err.println("Falha ao adicionar estoque: " + e.getMessage());
        }
        caneta.exibirResumo();
    }
    }

