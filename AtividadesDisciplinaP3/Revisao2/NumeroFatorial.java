package AtividadesDisciplinaP3.Revisao2;

public class NumeroFatorial {

    /*
     * Faça uma função que receba um número inteiro e retorne o fatorial do
     * número digitado, faça a solução iterativa e a solução recursiva.
     */

    public static void main(String[] args) {
        int numero = 2;
        long fatorial = calcularFatorialIterativo(numero);
        System.out.println("Fatorial de " + numero + " = " + fatorial);

        // long fatorial = calcularFatorialRecursivo(numero);

    }

    public static long calcularFatorialIterativo(int numero) {
        if (numero < 0) {
            System.out.println("O número não pode ser negativo.");
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static long calcularFatorialRecursivo(int numero) {
        if (numero < 0) {
            System.out.println("O número não pode ser negativo.");
        }

        if (numero == 0 || numero == 1) {
            return 1;
        }

        return numero * calcularFatorialRecursivo(numero - 1);
    }
}
