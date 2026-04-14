import java.util.Scanner;

public class AtvdUm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

      
        do {
            System.out.println("Escreva números inteiros para fazer a média (digite 0 para sair):");
            int numerosInteiros = scn.nextInt();

            if (numerosInteiros == 0) {
                System.out.println("Aplicação encerrada");
                break;
            } else {
                soma += numerosInteiros;  
                contador++;  
            }

        } while (true);  

        if (contador > 0) {
           
            double media =  soma / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }
    }
}

