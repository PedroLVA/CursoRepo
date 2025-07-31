package poo1.aula30_07.exercicio6;

public class Principal {

    public static void main(String[] args) {
        CaixaDeCompras caixa = new CaixaDeCompras();

        // Cenário 1: Total menor que 100
        double valorFinal1 = caixa.calcularTotalComDesconto(30.50, 50.00, 10.25);
        System.out.println("cenario 1 (Total < 100):");
        System.out.printf("O valor final da compra é: R$ %.2f\n", valorFinal1);
        System.out.println("------------------------------------");

        // Cenário 2: Total igual a 100
        double valorFinal2 = caixa.calcularTotalComDesconto(50.00, 25.00, 25.00);
        System.out.println("Cenario 2 (Total = 100):");
        System.out.printf("O valor final da compra é: R$ %.2f\n", valorFinal2);
        System.out.println("------------------------------------");

        // Cenário 3: Total maior que 100
        double valorFinal3 = caixa.calcularTotalComDesconto(80.00, 70.00, 50.00);
        System.out.println("cenário 3 (Total > 100):");
        System.out.printf("O valor final da compra é: R$ %.2f\n", valorFinal3);
        System.out.println("------------------------------------");
    }
}