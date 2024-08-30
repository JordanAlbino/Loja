import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja(){
        this.produtos = new ArrayList<>();
    }

    //função para adicionar produtos a lista;
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    //função para listar todos os produtos presentes na lista;
    public List<Produto> listaProdutos(){
        return produtos;
    }

    //função para buscar produtos pelo o nome;
    public List<Produto> buscarPorNome(String nome){
        List<Produto> encontrado = new ArrayList<>();
        for (Produto produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)) {
               encontrado.add(produto); 
            }
        }
        return encontrado;
    }

    //função para buscar produtos pela categoria;
    public List<Produto> buscarPorCategoria(String categoria){
        List<Produto> encontrados = new ArrayList<>();
        for (Produto produto : produtos){
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                encontrados.add(produto);
            }
        }
        return encontrados;
    }
}
