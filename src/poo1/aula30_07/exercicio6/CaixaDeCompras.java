package poo1.aula30_07.exercicio6;

public class CaixaDeCompras {

    public double calcularTotalComDesconto(double valor1, double valor2, double valor3) {
        double somaTotal = valor1 + valor2 + valor3;

        if (somaTotal > 100.0) {
            double desconto = somaTotal * 0.10;
            return somaTotal - desconto;
        }

        return somaTotal;
    }
}
