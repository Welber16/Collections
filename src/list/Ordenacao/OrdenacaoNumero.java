package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    public List<Integer> numerosList;

    public OrdenacaoNumero() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(5);
        ordenacaoNumero.adicionarNumero(6);
        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(50);
        ordenacaoNumero.adicionarNumero(14);
        ordenacaoNumero.adicionarNumero(23);
        ordenacaoNumero.adicionarNumero(0);

        ordenacaoNumero.ordenarAscendente();
        ordenacaoNumero.ordenarDescendente();

        System.out.println(ordenacaoNumero.numerosList);
        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println(ordenacaoNumero.ordenarDescendente());
    }
}
