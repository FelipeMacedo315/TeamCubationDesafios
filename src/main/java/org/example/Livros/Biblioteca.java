package org.example.Livros;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    ArrayList<Livro> estoqueLivros = new ArrayList<>();

    public Biblioteca() {

    }

    public void adicionarLivros(Livro livro) {
        estoqueLivros.add(livro);
    }

    public void listarLivros() {
        for (Livro cadaLivro : estoqueLivros) {
            System.out.println(cadaLivro.getTitulo());
            System.out.println(cadaLivro.getAnoPublicacao());
            System.out.println(cadaLivro.getAutor());
        }
    }

    public Livro buscarLivrosPorTitulo(String txtPesquisa) {
        for (Livro cadaLivro : estoqueLivros) {
            if (Objects.equals(cadaLivro.getTitulo(), txtPesquisa)) {
                return cadaLivro;
            }
        }
        return null;
    }

}
