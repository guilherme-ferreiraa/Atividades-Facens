import java.util.Scanner;

public class AtvdQuatro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int [] numeros = new int [5];
       int soma = 0;
       int multiplicação = 1;
        

        System.out.println("Digite 5 numeros para fazer a soma e a multiplicação deles:");
        for(int i = 0; i < numeros.length ; i++ ){
            
            numeros[i] = scn.nextInt();
        }

        for(int i =  0; i < numeros.length; i++ ){

            soma += numeros[i]; 
        }

        for(int j = 0;  j < numeros.length ; j++){
            
            multiplicação *= numeros[j];

        }
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da multiplicação: " + multiplicação);
        

    }
}