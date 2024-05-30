package org.example.Livros;

import java.util.Objects;

public class Revista extends Livro implements ItemBiblioteca {
    private int edicao;

    public Revista(int numEdicao, String titulo, String autor, Integer ano) {
        super(titulo, autor, ano);
        this.edicao = numEdicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes(Biblioteca biblioteca, String titulo) {
        for (Livro element : biblioteca.estoqueLivros) {
            if (Objects.equals(element.getTitulo(), titulo)) {
                System.out.println("Achou revista");
                System.out.println("Nome: " + element.getTitulo() + " Ano de publicacao: " + element.getAnoPublicacao() + " Autor " + element.getAutor());
                return;
            }
        }
    }
}
