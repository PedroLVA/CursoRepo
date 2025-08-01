package poo1.aula31_07.exercicio7;

public class Livro {
    public String titulo;
    String autor;
    private int paginas;

    public void setPaginas(int p) {
        if (p > 0) {
            paginas = p;
        }
    }

    public int getPaginas() {
        return paginas;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}
