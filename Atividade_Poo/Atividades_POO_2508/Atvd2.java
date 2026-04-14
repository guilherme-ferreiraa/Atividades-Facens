 import java.util.Scanner;
 
 public class Atvd2{
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);

        System.out.println("Escreva um número inteiro");
        int num1 = scn.nextInt();

        boolean resultado = VerificarNumero(num1);

        if(resultado){
         
            System.out.println("Número " + num1 + " é verdadeiro");
        }else{
            
            System.out.println("Numero "+ num1 + " é falso");
        }
        



    }

    public static boolean VerificarNumero(int num){
      return num % 2 == 0;

    }
}
