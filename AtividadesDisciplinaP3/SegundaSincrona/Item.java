package AtividadesDisciplinaP3.SegundaSincrona;

public class Item {
    private String nome;
    private int codigo;
    private double valor;
    private int quantEstoque;
    private boolean disponibilidade;

    public Item(String nome, int codigo, double valor, int quantEstoque, boolean disponibilidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantEstoque = quantEstoque;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
