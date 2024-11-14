public class main {
    public static void main(String[] args) {
        // Obter a instância única do carrinho de compras
        CarrinhoDeCompras carrinho = CarrinhoDeCompras.getInstance();

        // Criar alguns produtos
        Produto produto1 = new Produto("Camiseta", 59.90);
        Produto produto2 = new Produto("Calça Jeans", 129.90);
        Produto produto3 = new Produto("Tênis", 199.90);
        Produto produto4 = new Produto("Meia", 15.00);

        // Adicionar produtos ao carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        carrinho.adicionarProduto(produto4);

        // Exibir itens no carrinho e o total
        carrinho.exibirCarrinho();
        System.out.println("Total do Carrinho: R$" + carrinho.calcularTotal());

        // Remover um produto e exibir novamente
        carrinho.removerProduto(produto2);
        carrinho.exibirCarrinho();
        System.out.println("Total do Carrinho após remoção: R$" + carrinho.calcularTotal());
    }
}