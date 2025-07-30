package poo1.aula29_07;

import poo1.aula29_07.exercicio4.Livro;

public class MainExc3_4 {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        Livro livro2 = new Livro("1984", "George Orwell", 1949);


        System.out.println("Informações do Livro 1:");
        livro1.exibirInformacoes();

        System.out.println("Informações do Livro 2:");
        livro2.exibirInformacoes();
    }
}
