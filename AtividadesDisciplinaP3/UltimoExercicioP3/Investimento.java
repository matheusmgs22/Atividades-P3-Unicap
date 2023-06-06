package AtividadesDisciplinaP3.UltimoExercicioP3;

public class Investimento extends Produto{

    public Investimento(double valor, String data, String hora) {
        super(valor, data, hora);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void rendimento() {

        Cliente cliente = new Cliente(getData(), 0, getHora(), getData(), getValor(), null);
        double rendimento = cliente.getSaldo() * 0.03;

        cliente.setSaldo(rendimento);
    }

}
