package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item t : itemList) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(t);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("feijao", 15, 3);
        carrinhoCompras.adicionarItem("arroz", 18, 1);

        carrinhoCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.removerItem("feijao");
        carrinhoCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
    }

}
