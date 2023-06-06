package AtividadesDisciplinaP3.SegundaSincrona;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String bomCliente;
    private Item[] carinhoDeCompras;

    public Cliente(String nome, int idade, String cpf, String endereco, String bomCliente, Item[] carinhoDeCompras) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carinhoDeCompras = new Item[100];
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(String bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarinhoDeCompras() {
        return carinhoDeCompras;
    }

    public void setCarinhoDeCompras(Item[] carinhoDeCompras) {
        this.carinhoDeCompras = carinhoDeCompras;
    }

    public void adicionar(Item item) {

        for (int i = 0; i < carinhoDeCompras.length; i++) {
            if (carinhoDeCompras[i] == null) {
                carinhoDeCompras[i] = item;
                break;
            }
        }

    }

    public void cancelar(Item codigo) {

        for (int i = 0; i < carinhoDeCompras.length; i++) {
            if (carinhoDeCompras[i] == codigo) {
                carinhoDeCompras[i] = null;
                break;
            }
        }
    }

    public double comprar() {

        double soma = 0;
        int reduzirEstoque = 0;
        int quantidadeItems = 0;
        double gastoTotal = 0;

        for (int i = 0; i < carinhoDeCompras.length; i++) {
            if (carinhoDeCompras[i] != null) {
                soma += carinhoDeCompras[i].getValor();
                reduzirEstoque -= carinhoDeCompras[i].getQuantEstoque();
                quantidadeItems++;
            }

            gastoTotal += carinhoDeCompras[i].getValor();
        }

        double mediaGasto = soma / quantidadeItems;
        return mediaGasto;
    }
}
