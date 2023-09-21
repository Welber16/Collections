package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {

    private Set<String> palavrasSet;

    public ConjuntoPalavras() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasSet.isEmpty()) {
            palavrasSet.remove(palavra);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);

    }

    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        conjuntoPalavras.adicionarPalavra("casa 1");
        conjuntoPalavras.adicionarPalavra("casa 2");
        conjuntoPalavras.adicionarPalavra("casa 3");
        conjuntoPalavras.adicionarPalavra("casa 4");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.removerPalavra("casa 2");
        conjuntoPalavras.removerPalavra("casa 5");

        conjuntoPalavras.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavras.verificarPalavra("casa 6") ? "A palavra existe no conjunto." : "A palavra não existe no conjunto.");
        System.out.println(conjuntoPalavras.verificarPalavra("casa 1") ? "A palavra existe no conjunto." : "A palavra não existe no conjunto.");

    }
}
