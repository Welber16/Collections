package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefasSet.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa d : tarefasSet) {
                if (d.getDescricao() == descricao) {
                    tarefaParaRemover = d;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("A descrição está vazia!");
        }

    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("A descrição está vazia!");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {

        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        if(tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear();
            System.out.println("Todos os itens foram excluidos com sucesso!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa(new Tarefa(true, "estudar 1"));
        listaTarefas.adicionarTarefa(new Tarefa(false, "estudar 2"));
        listaTarefas.adicionarTarefa(new Tarefa(false, "estudar 3"));
        listaTarefas.adicionarTarefa(new Tarefa(false, "estudar 4"));

        listaTarefas.exibirTarefas();

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.removerTarefa("estudar 4");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("estudar 1");
        listaTarefas.marcarTarefaConcluida("estudar 2");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println(listaTarefas.contarTarefas() + " Tarefa(s) na lista");

        listaTarefas.limparListaTarefas();
        System.out.println(listaTarefas.contarTarefas() + " Tarefa(s) na lista");
    }

}

