package EstudandoPOO.exemplo2;

public class Shampoo extends Produto {

    private Integer irritabilidade;

    public Shampoo(String nome, double preco, String dataValidade, Integer irritabilidade) {
        super(nome, preco, dataValidade);
        this.irritabilidade = irritabilidade;
    }

    public Integer getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(Integer irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    @Override
    public String toString() {
        return "Produto : Shampoo, Preco: " + getPreco()+ "Data de validade: " + getDataValidade() + "Irritabiliade do Produto: " + irritabilidade;
    }



}
