public class Aluno{

    private int id ;
    private int idade ;
    private String nome ;

    
    
    public Aluno(){

    }
    
    
    public Aluno( String nome ){
        this.nome = nome;
        
    }

    public Aluno(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome , int idade , int id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void Imprimir(){
        System.out.println("Nome aluno : " + getNome()
                          + " \n Idade aluno : " + getIdade() + 
                          "  \n Aluno ID : "+ getId());
    
        
    }

}