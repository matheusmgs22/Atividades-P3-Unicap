package AtividadesDisciplinaP3.SegundaSincrona;

public class Funcionaria  extends ClienteEspecial{

    private String setor;
    private int id;
    private double salario;

    public Funcionaria(String nome, int idade, String cpf, String endereco, String bomCliente, Item[] carinhoDeCompras,
            int pontos, double saldoDeCompras, String setor, int id, double salario) {
        super(nome, idade, cpf, endereco, bomCliente, carinhoDeCompras, pontos, saldoDeCompras);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void renovarEstoque(int quantEstoque){

        for(int i = 0; i < getCarinhoDeCompras().length; i++){
           getCarinhoDeCompras()[i].setQuantEstoque(quantEstoque);
        }

    }

    public void bloquearItem(Item item){
        item.setDisponibilidade(false);

    }

}
