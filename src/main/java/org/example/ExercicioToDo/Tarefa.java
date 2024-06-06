package org.example.ExercicioToDo;

public class Tarefa {
    private String descricao;
     Boolean isConcluida = false;
     private int id;

    public Tarefa(String descricao, Boolean isConcluida) {
        this.descricao = descricao;
        this.isConcluida = isConcluida;
    }

    public Tarefa() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean isConcluida() {
        return isConcluida;
    }

    public void setConcluida(Boolean isConcluida) {
        if (isConcluida==null){
            setConcluida(false);
        }
        this.isConcluida = isConcluida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
