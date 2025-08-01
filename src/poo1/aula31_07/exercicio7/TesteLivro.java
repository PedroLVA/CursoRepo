package poo1.aula31_07.exercicio7;

public class TesteLivro {
    public static void main(String[] args) {
        Livro meuLivro = new Livro();


        meuLivro.titulo = "O Senhor dos Anéis";
        meuLivro.autor = "J.R.R. Tolkien";


        // definindo atraves do setter
        meuLivro.setPaginas(1200);

        System.out.println("--- Acesso Direto (dentro do possível) ---");
        System.out.println("Título (public): " + meuLivro.titulo);
        System.out.println("Autor (default): " + meuLivro.autor);
        // A linha abaixo da erro pq é private
        // System.out.println("Páginas (private): " + meuLivro.paginas);
        System.out.println("Paginas (atraves do getter): " + meuLivro.getPaginas());


        System.out.println("\n--- Acesso via Método ---");
        meuLivro.exibirInformacoes();
    }
}
