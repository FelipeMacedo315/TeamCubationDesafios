package org.example.Livros;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("A arte da Guerra", "Sun Tzu", 1940);

        Revista revista = new Revista(367, "Top 10 Receitas para o Verao", "TopFit", 2024);
        biblioteca.adicionarLivros(livro);
        biblioteca.adicionarLivros(revista);
        biblioteca.adicionarLivros(new Livro("Inferno", "Dante Alighieri", 1932));
        biblioteca.listarLivros();

        livro.exibirDetalhes(biblioteca, "A arte da guerra");
        revista.exibirDetalhes(biblioteca, "Top 10 Receitas para o Verao");

    }
    /// Acabei não entedendo e não consegui aplicar muito bem o conceito de polimorfismo
}
