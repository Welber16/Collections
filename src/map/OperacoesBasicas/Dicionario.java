package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisarPalavra = null;
        if (dicionarioMap.isEmpty()) {
        }else{
            pesquisarPalavra = dicionarioMap.get(palavra);
        }
        return pesquisarPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra 1", "definicao 1");
        dicionario.adicionarPalavra("palavra 2", "definicao 2");
        dicionario.adicionarPalavra("palavra 3", "definicao 3");
        dicionario.adicionarPalavra("palavra 4", "definicao 3");
        dicionario.adicionarPalavra("palavra 4", "definicao 4");
        dicionario.adicionarPalavra("palavra 5", "definicao 5");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("palavra 5");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("palavra 1"));
    }
}
