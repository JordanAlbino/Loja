public class Vendas {
    
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarProduto(new Produto("Smartphone", "Eletrônicos", 1500.00));
        loja.adicionarProduto(new Produto("Geladeira", "Eletrodomésticos", 2300.00));
        loja.adicionarProduto(new Produto("Smartphone", "Eletrônicos", 2500.00));
        loja.adicionarProduto(new Produto("Smartphone", "Eletrônicos", 3500.00));
        loja.adicionarProduto(new Produto("Frigobar", "Eletrodomésticos", 1500.00));
        loja.adicionarProduto(new Produto("Fogão", "Eletrodomésticos", 1500.00));
        loja.adicionarProduto(new Produto("Smartphone", "Eletrônicos", 1700.00));

        System.out.println("Todos os produtos:");
        for (Produto produto : loja.listaProdutos()){
            System.out.println(produto);
        }

        System.out.println("\nProdutos com nome 'Smartphone':");
        for (Produto produto : loja.buscarPorNome("Smartphone")){
            System.out.println(produto);
        }

        System.out.println("\nProdutos na categoria 'Eletrodomésticos':");
        for (Produto produto : loja.buscarPorCategoria("Eletrodomésticos")){
            System.out.println(produto);
        }

    }
}