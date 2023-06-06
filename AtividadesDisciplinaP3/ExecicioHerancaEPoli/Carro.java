package AtividadesDisciplinaP3.ExecicioHerancaEPoli;

public class Carro extends Veiculo {
    private String placa;


    public Carro(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual,
            double litragemDoTanque, double velocidadeMaxima , String placa) {
    super(marca, estado, tanque, consumo, velocidadeAtual, litragemDoTanque, velocidadeMaxima);
         this.placa = placa;
    }

    @Override
    public void acelerar(){

        double acelerar = 10;
        acelerar += this.getVelocidadeAtual();

    }



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
