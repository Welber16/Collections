package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    private void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno m : alunosSet) {
                if (m.getMatricula() == matricula) {
                    alunoParaRemover = m;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("A matricula esta incorreta!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunosSet);
        return alunoPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 5", 1L, 6);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 2L, 7);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 3L, 5);
        gerenciadorAlunos.adicionarAluno("Aluno 1", 4L, 9);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 1L, 10);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 5L, 10);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(5L);

        gerenciadorAlunos.exibirAlunos();

        System.out.print(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }
}

