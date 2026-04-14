import java.util.Scanner;

public class Main_Animal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Animal animal = null;
        int opcao;

        do {
            System.out.println("\n===== MENU ANIMAL VIRTUAL =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Alimentar");
            System.out.println("3 - Brincar");
            System.out.println("4 - Dormir");
            System.out.println("5 - Mostrar Status");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scn.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número: ");
                scn.next();
            }
            opcao = scn.nextInt();
            scn.nextLine(); 

            switch (opcao) {
                case 1:
                    animal = new Animal();
                    System.out.print("Digite o nome do animal: ");
                    animal.setNome(scn.nextLine());

                    System.out.print("Digite o tipo do animal: ");
                    animal.setTipo(scn.nextLine());

                    System.out.print("Digite a idade do animal: ");
                    while (!scn.hasNextInt()) {
                        System.out.print("Idade inválida. Digite um número inteiro: ");
                        scn.next();
                    }
                    animal.setIdade(scn.nextInt());
                    scn.nextLine();

                    animal.inicializarStatus(); 
                    System.out.println("Animal cadastrado com sucesso!");
                    break;

                case 2:
                    if (animal != null) animal.alimentar();
                    else System.out.println("Nenhum animal cadastrado.");
                    break;

                case 3:
                    if (animal != null) animal.brincar();
                    else System.out.println("Nenhum animal cadastrado.");
                    break;

                case 4:
                    if (animal != null) animal.dormir();
                    else System.out.println("Nenhum animal cadastrado.");
                    break;

                case 5:
                    if (animal != null) {
                        System.out.println("\n--- STATUS DO ANIMAL ---");
                        System.out.println(animal.mostrarStatus());
                    } else {
                        System.out.println("Nenhum animal cadastrado.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (animal != null && !animal.isVivo()) {
                System.out.println("\nO animal morreu! O programa será encerrado.");
                break;
            }

        } while (opcao != 6);

        scn.close();
    }
}

class Animal {
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;
    private boolean vivo;

    // Métodos set/get
    public void setNome(String nome) { 
        this.nome = nome; }
   
    
    public String getNome() { 
        return nome; }

    
     public void setTipo(String tipo) { 
        this.tipo = tipo; }
   
    
    public String getTipo() { 
        return tipo; }

    
        public void setIdade(int idade) { 
        this.idade = idade; }
    
    
        
    public int getIdade() { return idade; }

   
    public boolean isVivo() { 
        return vivo; }

    // Inicializar status padrão
    public void inicializarStatus() {
        this.energia = 100;
        this.felicidade = 100;
        this.vivo = true;
    }

    // Métodos de ação
    public void alimentar() {
        if (vivo) {
            energia += 10;
            if (energia > 100) energia = 100;
            System.out.println(nome + " foi alimentado! Energia atual: " + energia);
        } else {
            System.out.println(nome + " não pode ser alimentado, pois está morto.");
        }
    }

    public void brincar() {
        if (vivo) {
            felicidade += 10;
            if (felicidade > 100) felicidade = 100;
            energia -= 5;
            System.out.println(nome + " brincou! Felicidade: " + felicidade + ", Energia: " + energia);
            if (energia < 0) {
                vivo = false;
                System.out.println(nome + " ficou sem energia e morreu!");
            }
        } else {
            System.out.println(nome + " não pode brincar, pois está morto.");
        }
    }

    public void dormir() {
        if (vivo) {
            energia = 100;
            System.out.println(nome + " dormiu e recuperou toda a energia!");
        } else {
            System.out.println(nome + " não pode dormir, pois está morto.");
        }
    }

    public String mostrarStatus() {
        return "Nome: " + nome +
                "\nTipo: " + tipo +
                "\nIdade: " + idade +
                "\nEnergia: " + energia +
                "\nFelicidade: " + felicidade +
                "\nVivo: " + (vivo ? "Sim" : "Não");
    }
}
