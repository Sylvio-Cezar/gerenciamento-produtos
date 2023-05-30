package services;

import models.Produto;
import java.util.ArrayList;

public class GerenciadorProdutos {
    private ArrayList<Produto> produtos;

    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId() == produto.getId()) {
                System.out.println("\nJá existe um produto com o mesmo ID.");
                return;
            }
        }
        produtos.add(produto);
        System.out.println("\nProduto adicionado com sucesso.");
    }

    public void removerProduto(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                produtos.remove(p);
                System.out.println("\nProduto removido com sucesso.");
                return;
            }
        }
        System.out.println("\nProduto não encontrado.");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado.");
        } else {
            System.out.println("\nLista de produtos:");
            for (Produto produto : produtos) {
                System.out.println(
                    "ID: " + produto.getId() +
                    ", Nome: " + produto.getNome() +
                    ", Preço: " + produto.getPreco()
                );
            }
        }
    }
}
