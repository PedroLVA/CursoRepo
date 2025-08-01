package poo1.aula31_07.exercicio8;

public class Analista extends Funcionario {

    @Override
    public double calcularSalario() {
        return 3000 + BONUS_BASE;
    }
}
