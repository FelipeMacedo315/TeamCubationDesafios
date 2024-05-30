package org.example.Livros;

import java.util.Objects;

public class Livro implements ItemBiblioteca {
    private String Titulo;
    private String Autor;
    private Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer ano) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.anoPublicacao = ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        if (anoPublicacao < 0) {
            System.out.println("Ano invalido");
        } else {
            this.anoPublicacao = anoPublicacao;
        }
    }

    @Override
    public void exibirDetalhes(Biblioteca biblioteca, String titulo) {
        for (Livro element : biblioteca.estoqueLivros) {
            if (Objects.equals(element.getTitulo(), titulo)) {
                System.out.println("Achou livro");
                System.out.println("Nome: " + element.getTitulo() + " Ano de publicacao: " + element.getAnoPublicacao() + " Autor " + element.getAutor());
                return;
            }
        }
        System.out.println("Titulo não encontrado");

    }


}
