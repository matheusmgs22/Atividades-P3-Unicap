package AtividadesDisciplinaP3.Revisao2;

public class MenorNumeroMatriz {

    // Faça uma função que receba um vetor e imprima o menor valor dele.

    public static void main(String[] args) {
        int[] vetor = { 5, 3, 9, 1, 7 };
        imprimirMenorValor(vetor);
    }

    public static void imprimirMenorValor(int[] vetor) {
        if (vetor.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        int menorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

        System.out.println("Menor valor do vetor: " + menorValor);
    }
}
