package AtividadesDisciplinaP3.AtividadeDistancia;
public class Main {
    public static void main(String[] args) throws Exception {
       Ponto ponto1  = new Ponto(1,1);
       Ponto ponto2  = new Ponto(5,4);
       Ponto ponto3 = new Ponto (5,1);

       Triangulo t1 = new Triangulo(ponto1, ponto2, ponto3);

       System.out.println("A distancia entre os dois pontos: " + ponto1.distancia(ponto2));
       System.out.println("A distancia entre os dois pontos: " + ponto2.distancia(ponto1));

       System.out.println(t1.area());

       Ponto ponto4 = new Ponto (1,1);
       Ponto ponto5 = new Ponto (2,2);
       Ponto ponto6 = new Ponto (3,3);

       Triangulo t2 = new Triangulo(ponto4, ponto5, ponto6);

       System.out.println(t2.area());

       System.out.println(t1.perimetro());

}
}
