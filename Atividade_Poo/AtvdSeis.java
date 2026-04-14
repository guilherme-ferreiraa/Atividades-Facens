import java.util.Scanner;

public class AtvdSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double precoCusto;
        double precoNovo;
        double somaOriginal = 0;
        double somaAumentado = 0;
        int quantidadeProdutos = 0;

        System.out.println("Digite o código do produto (ou um número negativo para encerrar): ");
        codigo = sc.nextInt();

        while (codigo >= 0) {
            System.out.print("Digite o preço de custo do produto " + codigo + ": ");
            precoCusto = sc.nextDouble();

            
            precoNovo = precoCusto * 1.20;

            
            somaOriginal += precoCusto;
            somaAumentado += precoNovo;
            quantidadeProdutos++;

            
            System.out.println("Código: " + codigo + " | Preço novo: R$ " + String.format("%.2f", precoNovo));

            System.out.println("\nDigite o código do próximo produto (ou um número negativo para encerrar): ");
            codigo = sc.nextInt();
        }

        if (quantidadeProdutos > 0) {
            double mediaOriginal = somaOriginal / quantidadeProdutos;
            double mediaAumentado = somaAumentado / quantidadeProdutos;

            System.out.println("\n=== RESUMO ===");
            System.out.println("Média dos preços originais: R$ " + String.format("%.2f", mediaOriginal));
            System.out.println("Média dos preços com aumento: R$ " + String.format("%.2f", mediaAumentado));
        } else {
            System.out.println("\nNenhum produto foi registrado.");
        }

    }
}
