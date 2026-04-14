import java.util.Scanner;

public class Atvd4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a temperatura atual para coverte-la em Fahrenheit :");
        double temperatura = scn.nextInt();

        temperatura = TransformarNumero( temperatura);

        System.out.println("A temperatura convertida é "+ temperatura);



       
    }

    public static double TransformarNumero(double num){

        double formula = (num * 9/5) + 32;

        return formula;
    }
}
