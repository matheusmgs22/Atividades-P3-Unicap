package AtividadesDisciplinaP3.AtividadeDistancia;

public class Triangulo {
    Ponto p1;
    Ponto p2;
    Ponto p3;

   public Triangulo(Ponto p1, Ponto p2, Ponto p3){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;


   }

   public double area(){
    double determinantes, resposta;
    double positivos , negativos;

    positivos = (p1.x + p2.y) + (p1.y + p3.x) + (p2.x + p3.y);
    negativos = (p2.y + p3.x) + (p1.x + p3.y) + (p1.y + p2.x);

    determinantes = positivos - negativos;

    determinantes = Math.abs(determinantes);

    resposta  = determinantes / 2;

    return resposta;

   }

   public double perimetro(){
    double resposta;

    resposta = p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1);

    return resposta;

   }

}
