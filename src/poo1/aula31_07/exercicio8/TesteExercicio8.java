package poo1.aula31_07.exercicio8;


public class TesteExercicio8 {
    public static void main(String[] args) {
        Analista analista1 = new Analista();
        analista1.setNome("João Silva");

        double salarioDoAnalista = analista1.calcularSalario();

        System.out.println("--- Teste da Classe Analista ---");
        System.out.println("Funcionario: " + analista1.getNome());
        System.out.println("Salário Calculado: R$ " + salarioDoAnalista);
    }
}
