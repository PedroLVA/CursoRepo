package poo1.aula31_07.desafio3;

public class SegurancaUtils {

    public static boolean validarSenhaForte(String senha) {
        if (senha == null || senha.length() <= 8) {
            return false;
        }

        boolean temNumero = false;
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                temNumero = true;
                break;
            }
        }
        return temNumero;
    }
}