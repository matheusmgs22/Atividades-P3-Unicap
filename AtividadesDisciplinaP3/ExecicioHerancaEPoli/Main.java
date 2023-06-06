package AtividadesDisciplinaP3.ExecicioHerancaEPoli;

public class Main {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo("balotelli", true, 140, 10 , 30, 70, 200);

        carro1.chavear(true);
        carro1.acelerar();

        System.out.println(carro1.getVelocidadeAtual());


    }
}
