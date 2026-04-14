
import java.util.Scanner;
public class Atvd1{
     public static void main(String[]args){
     Scanner scn = new Scanner(System.in);

     System.out.println("Vamos fazer uma operação com dois numeros");
     System.out.println("Digite o primeiro número: ");
     int num1 = scn.nextInt();
     System.out.println("Digite o segundo número: ");
     int num2 = scn.nextInt();
     System.out.println("Agora digite o operador que quer usar \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 -Divisão");
     int escolha = scn.nextInt();
     
     double resultado = Operacao(num1 , num2 , escolha);
     
     System.out.println(resultado);
        
    }


public static double Operacao (int num1 , int num2 , int opt ){

    
    double resultado = 0;
    switch(opt){

       case 1: 
        resultado = num1 + num2;
        break;

       case 2: 
       resultado = num1 - num2;
       break;

       case 3: 
        resultado = num1 * num2;
        break;

       case 4: 
       resultado = num1 / num2;
       break;
        
    }
 
     return resultado;

   

}
}


