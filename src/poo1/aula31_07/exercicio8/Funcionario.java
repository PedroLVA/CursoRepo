package poo1.aula31_07.exercicio8;

public abstract class Funcionario {
    public static final double BONUS_BASE = 500.0;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
