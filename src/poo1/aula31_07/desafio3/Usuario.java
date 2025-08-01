package poo1.aula31_07.desafio3;

public abstract class Usuario {

    private String senha;
    protected String email;
    public String nome;

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected String getSenha() {
        return this.senha;
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}