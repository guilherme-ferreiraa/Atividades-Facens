public class AtvdRevisao1{
    public static void main(String[]args){

        double nota1 = 7.5;
        double nota2 = 4.5;
        double nota3 = 9.0;
         
        double resultado = CalcularMedia ( nota1,  nota2, nota3);

        System.out.println("A media das notas " + nota1 + ", " + nota2 + " e "+ nota3 + " é " + resultado);



    }

    public static double CalcularMedia(double num1, double num2 , double num3){
       double formula = (num1 + num2 + num3) /3;

       return formula;
    }
}
