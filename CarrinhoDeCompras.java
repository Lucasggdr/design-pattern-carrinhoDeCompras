import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // A única instância da classe
    private static CarrinhoDeCompras instance;
    private List<Produto> produtos;

    // Construtor privado para impedir instanciamento externo
    private CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    // Método para obter a instância única do carrinho
    public static CarrinhoDeCompras getInstance() {
        if (instance == null) {
            instance = new CarrinhoDeCompras();
        }
        return instance;
    }

    // Adicionar produto ao carrinho
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Remover produto do carrinho
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    // Exibir os itens no carrinho
    public void exibirCarrinho() {
        System.out.println("Itens no Carrinho:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    // Calcular o total do carrinho
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}