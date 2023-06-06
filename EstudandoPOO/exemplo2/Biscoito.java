package EstudandoPOO.exemplo2;

public class Biscoito extends Produto {

    private Integer compCancer;

    public Biscoito(String nome, double preco, String dataValidade, Integer compCancer) {
        super(nome, preco, dataValidade);
        this.compCancer = compCancer;
    }

    public Integer getCompCancer() {
        return compCancer;
    }

    public void setCompCancer(Integer compCancer) {
        this.compCancer = compCancer;
    }

    @Override
    public String toString(){
        return "Produto : Biscoito , Preco : " + getPreco() + "Data de Validade: " + getDataValidade() + "Componentes cancerigenos: "  + compCancer;
    }


}
