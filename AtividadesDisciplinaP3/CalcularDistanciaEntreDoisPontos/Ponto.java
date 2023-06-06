package AtividadesDisciplinaP3.CalcularDistanciaEntreDoisPontos;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Ponto p) {
        double resposta, d1, d2;

        d1 = this.x - p.x;
        d2 = this.y - p.y;

        d1 = Math.pow(d1, 2);
        d2 = Math.pow(d2, 2);

        resposta = d1 + d2;
        resposta = Math.sqrt(resposta);

        return resposta;

    }

}
