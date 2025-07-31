package poo1.aula30_07.desafio2;

public class Reembolso {
    private String nomeFuncionario;
    private int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
        double total = alimentacao + transporte + hospedagem;
        if (this.diasTrabalhados > 7) {
            total *= 1.10; //regre de negocio solicitada
        }
        return total;
    }

    public double calcularReembolso(double alimentacao, double transporte) {
        double total = alimentacao + transporte;
        if (this.diasTrabalhados > 7) {
            total *= 1.10;
        }
        return total;
    }

    public void imprimirResumoReembolso(double valorTotal) {
        System.out.printf("Funcionário: %s – Dias Trabalhados: %d – Reembolso Total: R$ %.2f\n",
                this.nomeFuncionario, this.diasTrabalhados, valorTotal);
    }
}
