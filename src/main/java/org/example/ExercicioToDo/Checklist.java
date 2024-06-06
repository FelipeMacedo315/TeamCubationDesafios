package org.example.ExercicioToDo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Checklist {
    List<Tarefa> listas = new ArrayList<>();

    public Checklist() {

    }

    void addTarefa(Tarefa tarefa) {
        listas.add(tarefa);
    }

    List<Tarefa> getTodasAsTarefas() {
        return listas;
    }

    List<Tarefa> getTodasAsTarefasConcluidas() {
        return listas.stream().filter(tarefa -> tarefa.isConcluida).toList();
    }

    List<Tarefa> getTodasAsTarefasPendentes() {
        return listas.stream().filter(tarefa -> !tarefa.isConcluida).toList();
    }

    List<String> getTodasAsDescricoes() {
        return listas.stream().map(Tarefa::getDescricao).collect(Collectors.toList());
    }

    List<Tarefa> getTodasAsTarefasOrdenadasPorConclusao() {
     return listas.stream().sorted(Comparator.comparing(element -> element.isConcluida)).toList();
    }

    void alterarStatusTarefa(int id, boolean novoStatus) {
        Optional<Tarefa> x = listas.stream().filter(element ->element.getId()==id ).findFirst();
        if (x.isPresent()){
            Tarefa tarefaAtual = x.get();
            tarefaAtual.setConcluida(novoStatus);

        }
        // atualizar o is concluida aqui

    }
}
