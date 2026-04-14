import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // leitura da quantidade de discos
        System.out.print("Digite a quantidade de discos: ");
        int n = sc.nextInt();

        // validação
        if (n <= 0) {
            System.out.println("A quantidade de discos deve ser maior que zero.");
            return;
        }

        // criação da matriz (torres A, B, C)
        int[][] torres = new int[n][3];

        // inicializa todos os discos na torre A (coluna 0)
        for (int i = 0; i < n; i++) {
            torres[i][0] = i + 1;
        }

        System.out.println("\nEstado inicial:");
        exibirTorres(torres);

        // chamada da recursão
        hanoi(n, 'A', 'B', 'C', torres);

        sc.close();
    }

    // método recursivo da Torre de Hanoi
    public static void hanoi(int n, char origem, char destino, char auxiliar, int[][] torres) {

        // condição de parada
        if (n == 1) {
            System.out.println("\nMover disco 1 de " + origem + " para " + destino);
            moverDiscoNaMatriz(torres, origem, destino);
            exibirTorres(torres);
            return;
        }

        // passo 1
        hanoi(n - 1, origem, auxiliar, destino, torres);

        // passo 2
        System.out.println("\nMover disco " + n + " de " + origem + " para " + destino);
        moverDiscoNaMatriz(torres, origem, destino);
        exibirTorres(torres);

        // passo 3
        hanoi(n - 1, auxiliar, destino, origem, torres);
    }

    // converte A, B, C para índices da matriz
    public static int getIndiceTorre(char torre) {
        if (torre == 'A') return 0;
        if (torre == 'B') return 1;
        return 2;
    }

    // move o disco na matriz
    public static void moverDiscoNaMatriz(int[][] torres, char origem, char destino) {

        int colOrigem = getIndiceTorre(origem);
        int colDestino = getIndiceTorre(destino);

        int linhaOrigem = -1;
        int disco = 0;

        // encontra o primeiro disco da torre de origem (de cima pra baixo)
        for (int i = 0; i < torres.length; i++) {
            if (torres[i][colOrigem] != 0) {
                linhaOrigem = i;
                disco = torres[i][colOrigem];
                torres[i][colOrigem] = 0;
                break;
            }
        }

        // encontra posição na torre destino (de baixo pra cima)
        for (int i = torres.length - 1; i >= 0; i--) {
            if (torres[i][colDestino] == 0) {
                torres[i][colDestino] = disco;
                break;
            }
        }
    }

    // exibe a matriz das torres
    public static void exibirTorres(int[][] torres) {

        System.out.println("A B C");

        for (int i = 0; i < torres.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(torres[i][j] + " ");
            }
            System.out.println();
        }
    }
}