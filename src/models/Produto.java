package models;

public class Produto {
    private static int idAnterior = 0;

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = ++idAnterior;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}
