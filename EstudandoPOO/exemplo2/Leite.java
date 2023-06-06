package EstudandoPOO.exemplo2;

public class Leite extends Produto {

    private Integer duracaoLeite;

    public Leite(String nome, double preco, String dataValidade, Integer duracaoLeite) {
        super(nome, preco, dataValidade);
        this.duracaoLeite = duracaoLeite;
    }

    public Integer getDuracaoLeite() {
        return duracaoLeite;
    }

    public void setDuracaoLeite(Integer duracaoLeite) {
        this.duracaoLeite = duracaoLeite;
    }

    @Override
    public String toString() {
        return "Produto : Leite , Preco: " + getPreco() +"Data de validade: " + getDataValidade() + "Duracao do leite em dias: " +  duracaoLeite;
    }


}
