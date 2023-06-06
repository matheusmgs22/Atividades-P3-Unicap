package AtividadesDisciplinaP3.AtividadeDistancia;
public class Ponto{
    double x;
    double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto p){
        double resposta, d1 ,d2;

        d1 = x - p.x;
        d2 = y - p.y;

        d1 = Math.pow(d1,2);
        d2 = Math.pow(d2,2);

        resposta = d1 + d2;
        resposta = Math.sqrt(resposta);

        return resposta;


    }

}
