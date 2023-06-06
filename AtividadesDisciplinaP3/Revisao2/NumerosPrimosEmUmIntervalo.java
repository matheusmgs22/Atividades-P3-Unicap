package AtividadesDisciplinaP3.Revisao2;

public class NumerosPrimosEmUmIntervalo {

    /*
     * Faça uma função que receba dois números inteiros, sendo o primeiro o
     * limite inferior e o segundo o limite superior, e imprima todos os
     * números primos deste intervalo.
     */

    public static void main(String[] args) {
        int limiteInferior = 5;
        int limiteSuperior = 15;
        imprimirNumerosPrimos(limiteInferior, limiteSuperior);
    }

    public static void imprimirNumerosPrimos(int limiteInferior, int limiteSuperior) {
        System.out.println("Números primos no intervalo de " + limiteInferior + " a " + limiteSuperior + ":");

        for (int numero = limiteInferior; numero <= limiteSuperior; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }

        System.out.println();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
