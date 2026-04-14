import java.util.Scanner;

public class AtvdDois {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int codigoAluno;  
        double nota1, nota2, nota3; 
        double media;  

    
        while (true) {
            System.out.print("Digite o código do aluno (digite 0 para encerrar): ");
            codigoAluno = scn.nextInt();  

            if (codigoAluno == 0) {
                System.out.println("Aplicação encerrada.");
                break;  
            }

            
            System.out.print("Digite a primeira nota: ");
            nota1 = scn.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = scn.nextDouble();

            System.out.print("Digite a terceira nota: ");
            nota3 = scn.nextDouble();

           
            media = (nota1 + nota2 + nota3) / 3;

            
            System.out.println("A média do aluno " + codigoAluno + " é: " + media);
        }
    }
}