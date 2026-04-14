import java.util.Scanner;

public class AtvdRevisao2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Vamos calcular o volume da lata de óleo");

        System.out.println("Digite quanto de raio a lata de óleo possui:");
        double raio = scn.nextDouble();

        System.out.println("========================");

        System.out.println("Digite quanto de altura ele possui:");
        double altura = scn.nextDouble();

        double resultado = VolumeLata(raio, altura);

        System.out.println("O volume da lata é: " + resultado);

        
    }

    public static double VolumeLata(double r, double a) {
        double formula = ((r * r) * 3.14159) * a;
        return formula;
    }
}














/*Calcular e apresentar o volume de uma lata de óleo,
utilizando a fórmula:
Volume = 3.14159 * r2 * altura
 */