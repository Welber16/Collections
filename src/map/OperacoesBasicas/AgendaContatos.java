package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone); // metodo put em map serve para adicionar e atualizar
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("contato 1", 1231);
        agendaContatos.adicionarContato("contato 2", 1232);
        agendaContatos.adicionarContato("contato 3", 1233);
        agendaContatos.adicionarContato("contato 4", 1234);
        agendaContatos.adicionarContato("contato 5", 1234);
        agendaContatos.adicionarContato("contato 5", 1235);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("contato 4");

        agendaContatos.exibirContatos();


        System.out.println(agendaContatos.pesquisarPorNome("contato 1"));
        System.out.println(agendaContatos.pesquisarPorNome("contato 4"));
    }
}
