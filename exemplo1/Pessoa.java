package exemplo1;

public class Pessoa{

    private String nome;
    private int idade;
    private String [] objetos = new String [5];

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.objetos = objetos;
    }

    public void Exibir(){
        
        for(int i = 0 ; i <= objetos.length; i++){
            for(int j = 0 ; j <= objetos.length; j++){
            
            this.objetos[i] = this.nome;
            //this.objetos[j] = this.idade;

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        }
    }
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    



}