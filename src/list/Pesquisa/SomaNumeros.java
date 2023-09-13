package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {

        this.numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numerosList)
            soma += numero;
        return soma;
    }


    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("Nenhum numero adicionado");
        }
    }

    public void exibirMenorNumeros() {
        if (!numerosList.isEmpty()) {
            int menorNumero = Integer.MIN_VALUE;
            for (Integer numero : numerosList)
                System.out.println("Nenhum numero adicionado");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());
    }

}
