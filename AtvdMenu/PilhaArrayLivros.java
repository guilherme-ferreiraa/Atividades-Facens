import java.util.Scanner;

public class PilhaArrayLivros {

    private String[] livros;
    private int topo;

    public PilhaArrayLivros(int capacidade) {
        livros = new String[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == livros.length - 1;
    }

    public int tamanho() {
        return topo + 1;
    }

    public void empilharLivro(String tituloLivro) { 
        if (estaCheia()) {
            System.out.println(" A pilha está cheia");
            return;
        }

        livros[++topo] = tituloLivro; 
        System.out.println("Livro '" + tituloLivro + "' adicionado.");
    }

    public String desempilharLivro() { 
        if (estaVazia()) {
            System.out.println(" A pilha está vazia");
            return null;
        }

        String livroRemovido = livros[topo]; // Armazena o livro que será removido antes de limpar a posição
        livros[topo--] = null;
        System.out.println("🗑 Livro '" + livroRemovido + "' removido.");
        return livroRemovido;
    }

    public String consultarTopo() {
        if (estaVazia()) {
            System.out.println(" A pilha está vazia!");
            return null;
        }
        return livros[topo];
    }

    public void exibirPilhaLivros() {
        if (estaVazia()) {
            System.out.println(" nenhum livro na pilha");
            return;
        }

        System.out.println("\n Pilha (topo → base):");
        for (int i = topo; i >= 0; i--) {
            System.out.println("| " + livros[i] + " |");
        }
    }

    private static int lerCapacidadeValida(Scanner scanner) {
        while (true) {
            System.out.print("Informe a capacidade da pilha: ");  // Solicita a capacidade da pilha ao usuário

            if (scanner.hasNextInt()) {
                int capacidade = scanner.nextInt();
                scanner.nextLine();

                if (capacidade > 0) {
                    return capacidade;
                } else {
                    System.out.println(" Digite um número maior que zero");
                }
            } else {
                System.out.println(" Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        int capacidade = lerCapacidadeValida(scanner);
        PilhaArrayLivros pilha = new PilhaArrayLivros(capacidade);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Consultar topo");
            System.out.println("4 - Exibir pilha");
            System.out.println("5 - Mostrar quantidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println(" Digite um número válido");
                scanner.nextLine();
                opcao = -1;
                continue;
            }

            switch (opcao) {

                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    pilha.empilharLivro(titulo);
                    break;

                case 2:
                    pilha.desempilharLivro();
                    break;

                case 3:
                    String topo = pilha.consultarTopo();
                    if (topo != null) {
                        System.out.println(" Livro no topo: " + topo);
                    }
                    break;

                case 4:
                    pilha.exibirPilhaLivros();
                    break;

                case 5:
                    System.out.println(" Quantidade de livros: " + pilha.tamanho());
                    break;

                case 0:
                    System.out.println(" Fim do programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
