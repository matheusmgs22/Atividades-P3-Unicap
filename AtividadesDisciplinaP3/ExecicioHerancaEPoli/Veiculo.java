package AtividadesDisciplinaP3.ExecicioHerancaEPoli;

public class Veiculo {

    private String marca;
    private boolean estado;
    private double tanque;
    private double consumo;
    private double velocidadeAtual;
    private double litragemDoTanque;
    private double velocidadeMaxima;

    public Veiculo(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual,
                    double litragemDoTanque, double velocidadeMaxima) {

        this.marca = marca;
        this.estado = estado;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = velocidadeAtual;
        this.litragemDoTanque = litragemDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void chavear(boolean ligado){

        if(this.estado != ligado){
            this.estado = false;
        }else{
            this.estado = true;
        }

    }

    public void acelerar(){
        if(this.velocidadeAtual <= velocidadeMaxima){
            this.velocidadeAtual++;
        }else{
            System.out.println("velocidade Maxima atingidada!! Cuidado!" + this.velocidadeMaxima);
        }

    }

    public void frear(){
        if(this.velocidadeAtual != 0 && this.velocidadeAtual > 0){
            this.velocidadeAtual--;
        }else{
            System.out.println("velocidade minima atingidada!!" + this.velocidadeAtual);
        }
    }

    public void corrida(double distancia){

        double distanciaPercorrida = litragemDoTanque * consumo;

        //if( distanciapPercorrida >= distancia ){
            //double litrosCombustivel = distancia / consumo;

        //}

    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getLitragemDoTanque() {
        return litragemDoTanque;
    }

    public void setLitragemDoTanque(double litragemDoTanque) {
        this.litragemDoTanque = litragemDoTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
