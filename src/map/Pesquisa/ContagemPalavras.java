package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;



public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }

    }

    public int exibirContagemPalavras() {
        int contagemPalavras = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            contagemPalavras += entry.getValue();
        }
        return contagemPalavras;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 3);
        contagemPalavras.adicionarPalavra("Palavra 3", 10);
        contagemPalavras.adicionarPalavra("Palavra 4", 1);

        System.out.println(contagemPalavras.exibirContagemPalavras());
        contagemPalavras.removerPalavra("Palavra 4");
        System.out.println(contagemPalavras.exibirContagemPalavras());
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
