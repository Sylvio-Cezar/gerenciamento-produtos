import models.Produto;
import services.GerenciadorProdutos;

public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();

        Produto geladeira = new Produto("Geladeira", 4159.99);
        gerenciador.adicionarProduto(geladeira);

        Produto cadeira = new Produto("Cadeira", 199.99);
        gerenciador.adicionarProduto(cadeira);

        Produto mesa = new Produto("Mesa", 999.99);
        gerenciador.adicionarProduto(mesa);

        gerenciador.listarProdutos();

        gerenciador.removerProduto(2);

        gerenciador.listarProdutos();
    }
}
