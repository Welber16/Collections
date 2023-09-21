package set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private boolean concluida;

    private String descricao;

    public Tarefa(boolean concluida, String descricao) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "concluida=" + concluida +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
