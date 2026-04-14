import java.util.Scanner;
public class Aluno_Main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        
        
        
        
        System.out.println("Cadastro de aluno");
        
        System.out.println("Digite o nome do aluno");
        String nome = scn.nextLine();
        aluno1.setNome(nome);

        System.out.println("Digite a idade ");
        int idade = scn.nextInt();
        aluno1.setIdade(idade);

        System.out.println("Digite o ID");
        int id = scn.nextInt();
        aluno1.setId(id);

        System.out.println("\n=== Dados do Aluno ===");
        aluno1.Imprimir();

        System.out.println("Deseja cadastrar mais um aluno?");
        System.out.println("Digite 1 para Sim \n Digit 2 para Não" );
        int opt = scn.nextInt();

        if(opt > 2 && opt < 1){
            System.out.println("Escolha corretamente!");
        }else{
          
            while(opt == 1){
                System.out.println("Digite o nome do aluno");
                String nome2 = scn.nextLine();
                aluno1.setNome(nome);

            }

        }



        


    
        
    }
}
