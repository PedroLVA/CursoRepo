package poo1.aula31_07.desafio3;

public class TesteDesafio {

    public static void main(String[] args) {
        Administrador admin = new Administrador();

        System.out.println("--- teste de acesos direto aos atributos ---");

        admin.nome = "Admin Mestre";
        System.out.println("atributo 'nome' (public): acesso pemitido. valor: " + admin.nome);

        admin.email = "admin@sistema.com";
        System.out.println("atributo 'email' (protected): Acesso permitido (msm pacote). valor: " + admin.email);

        System.out.println("Atributo 'senha' (private): acesso direto n e permitido apartir da classe sistema.");

        System.out.println("\n--- exibindo dados do ususario ---");
        admin.exibirUsuario();

        System.out.println("\n--- teste de redefinicao de Senha ---");
        System.out.println("tentando redefinir com senah fraca 'senha123':");
        admin.redefinirSenha("senha123");

        System.out.println("\ntentando redefinir com senha forte 'NovaSenhaComNumero123':");
        admin.redefinirSenha("NovaSenhaComNumero123");

        System.out.println("\n--- testes de autenticacao ---");
        System.out.println("autenticando com a senha errada ('senhaerrada'): " + admin.autenticar("senhaerrada"));
        System.out.println("autenticando com a senha coreta ('NovaSenhaComNumero123'): " + admin.autenticar("NovaSenhaComNumero123"));

        System.out.println("\n--- teste direto do metodo utilitario ---");
        String p1 = "fraca";
        String p2 = "SenhaForteComNumero9";
        System.out.println("a senha '" + p1 + "' e forte? " + SegurancaUtils.validarSenhaForte(p1));
        System.out.println("A senha '" + p2 + "' é forte? " + SegurancaUtils.validarSenhaForte(p2));
    }
}
