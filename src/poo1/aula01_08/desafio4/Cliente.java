package poo1.aula01_08.desafio4;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.setCpf(cpf);
        this.setIdade(idade);
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    // --- Setters com Validação ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            System.err.println("Erro: CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
        }
    }

    public void setIdade(int idade) {
        if (idade > 17) {
            this.idade = idade;
        } else {
            System.err.println("Erro: Idade inválida. O cliente deve ser maior de idade (18 anos ou mais).");
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }
}
