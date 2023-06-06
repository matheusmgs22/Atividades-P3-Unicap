package AtividadesDisciplinaP3.SegundaSincrona;

public class ClienteEspecial extends Cliente {

    private int pontos;
    private double saldoDeCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, String bomCliente,
            Item[] carinhoDeCompras, int pontos, double saldoDeCompras) {
        super(nome, idade, cpf, endereco, bomCliente, carinhoDeCompras);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }

    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }


    public void adicionar(Item item) {

        for (int i = 0; i < getCarinhoDeCompras().length; i++) {
            if (getCarinhoDeCompras()[i] == null) {
                getCarinhoDeCompras()[i] = item;
                break;
            }
        }

    }

    @Override
    public double comprar(){
        double totalGasto = 0;
        int quantidadeItens = 0;

        for (int i = 0; i < getCarinhoDeCompras().length; i++) {

            if (getCarinhoDeCompras()[i] != null) {
                totalGasto += getCarinhoDeCompras()[i].getValor();
                quantidadeItens++;
            }
        }

        double desconto = totalGasto * 0.05;
        double totalGastoComDesconto = totalGasto - desconto;

        double saldoCompras = totalGastoComDesconto;

        return saldoCompras;
    }



}
