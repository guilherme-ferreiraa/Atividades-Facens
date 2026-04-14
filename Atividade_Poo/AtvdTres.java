import java.util.Scanner;

public class AtvdTres {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numeros = 0;
        int contador = 0;
        int soma = 0;
        
        while(true){
            System.out.println("Digite os numeros para fazer a media(Digite 0 para encerrar:)");
            numeros = scn.nextInt();
            
            if(numeros==0){
                System.out.println("Aplicação encerrada ");
                break;
            }
           
           
            if(numeros % 2 == 0){

                soma += numeros;
                contador++;
            }

        } 
            if(contador > 0){
                double media = (double) soma/contador;
                System.out.println("A media dos numeros é:" + media);
            }

    }
}

