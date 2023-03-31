package PrimeiraSincrona;

public class Trabalhador {

    private String nome;
    private int idade;
    private double valorHora;
    private int horasTrabalhadas;
    private boolean ferias;

public Trabalhador(String nome, int idade, double valorHora, int horasTrabalhadas, 
    boolean ferias) {
        
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.ferias = ferias;
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

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int valor) {
        this.horasTrabalhadas = horasTrabalhadas + valor;
    }

    public boolean getFerias() {
        return this.ferias;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    public void ferias(){
        if(this.ferias == true){
            this.ferias = false;
        }else{
            this.ferias = true;
        }
    }

}
