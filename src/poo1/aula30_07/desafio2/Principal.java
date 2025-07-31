package poo1.aula30_07.desafio2;

public class Principal {
    public static void main(String[] args) {
        Reembolso funcionario1 = new Reembolso("Joao Santos", 5);
        Reembolso funcionario2 = new Reembolso("Maria Oliveira", 10);
        Reembolso funcionario3 = new Reembolso("Pedro Costa", 8);

        System.out.println("--- Teste de Reembolso ---");


        double total1 = funcionario1.calcularReembolso(250.00, 120.00, 400.00);
        funcionario1.imprimirResumoReembolso(total1);

        double total2 = funcionario2.calcularReembolso(500.00, 250.00);
        funcionario2.imprimirResumoReembolso(total2);


        double total3 = funcionario3.calcularReembolso(400.00, 180.00, 600.00);
        funcionario3.imprimirResumoReembolso(total3);
    }
}