package EstudandoPOO.exemplo2;

public abstract class Produto {

    private String nome;
    private String dataValidade;
    private double preco;

    public Produto(String nome, double preco, String dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public abstract String toString();


}
