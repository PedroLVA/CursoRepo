package poo1.aula30_07.exercicio5;

public class Principal {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Maria Silva", "15 99876-5432");
        Contato contato2 = new Contato("Carlos Pereira", "11 98765-1234");

        System.out.println("Contatos originais:");
        System.out.println(contato1.obterContatoFormatado());
        System.out.println(contato2.obterContatoFormatado());

        System.out.println("\nAtualizando telefone do primeiro contato");
        contato1.atualizarTelefone("15 99999-0020");

        System.out.println("\nContatos após a atualização:");
        System.out.println(contato1.obterContatoFormatado());
        System.out.println(contato2.obterContatoFormatado());
    }
}
