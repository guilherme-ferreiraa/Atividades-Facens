import java.util.Scanner;
public class AtvdCinco{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int [] numerosInteiros = new int[10];
    int [] pares = new int[10];
    int [] impares = new int[10];
    int contPares = 0;
    int contImpares = 0;

    System.out.println("Insira os 10 números: ");
    for(int i = 0; i < numerosInteiros.length ; i++ ){
        numerosInteiros[i] = scn.nextInt();

    }

     for(int i = 0; i< numerosInteiros.length ; i++ ){
        if(numerosInteiros[i] % 2 == 0){
            
           pares[contPares] = numerosInteiros[i];
           contPares++ ;
        
        }else{
            impares[contImpares] = numerosInteiros[i];
            contImpares++;
        }


        
    }
        for(int i = 0; i<numerosInteiros.length ;i++){
            System.out.println(" Numeros inseridos"+ numerosInteiros[i]);
        }

        for(int i = 0; i< contPares ;i++){
            System.out.println("Numeros pares"+ pares[i]);
        }

        for(int i = 0; i<contImpares ;i++){
            System.out.println("Numeros impares"+ impares[i]);
        }
        
    }
}

/*Faça um Programa que leia 10 números inteiros e armazene-os num vetor. Armazene os números
pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores. */
