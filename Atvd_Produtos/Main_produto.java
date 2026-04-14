import java.util.Scanner;
public class Main_produto{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Insira as informações do produto: ");
        System.out.print("Nome do produto: ");
        produto.nome = scn.nextLine();
        System.out.print("Insira o preço do produto: ");
        produto.preço = scn.nextDouble();
        System.out.print("Insira a quantidade desse produto: ");
        produto.quantidade = scn.nextInt();

        System.out.println(produto.nome + " , " + produto.preço + " , " + produto.quantidade );



        
    }
}