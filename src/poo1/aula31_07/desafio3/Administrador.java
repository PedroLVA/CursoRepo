package poo1.aula31_07.desafio3;

public class Administrador extends Usuario {

    @Override
    public boolean autenticar(String senha) {
        if (senha == null || this.getSenha() == null) {
            return false;
        }
        return this.getSenha().equals(senha);
    }

    public void redefinirSenha(String novaSenha) {
        if (SegurancaUtils.validarSenhaForte(novaSenha)) {
            this.setSenha(novaSenha);
            System.out.println("Senha redefinida com sucesso.");
        } else {
            System.out.println("A nova senha não é forte o suficiente.");
        }
    }
}