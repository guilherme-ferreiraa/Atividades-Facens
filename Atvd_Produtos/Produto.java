public class Produto{

    public String nome;
    public Double preço;
    public int quantidade;

    public Double ValorTotalEmEstoque(){
         
        return preço*quantidade;
    }

    public void AdicionarProdutos(int quantidade){

        this.quantidade += quantidade;

    }

    public void RemoverProduto(int quantidade){

        this.quantidade -= quantidade;

    }
}
