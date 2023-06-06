package AtividadesDisciplinaP3.Revisao2;

public class MatrizTransposta {

    // Imprima uma matriz de inteiros 3x3 transposta.

    public static void main(String[] args) {
        // Matriz original
        int[][] matrizOriginal = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        // Matriz transposta
        int[][] matrizTransposta = new int[3][3];

        // Transposição da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[i][j] = matrizOriginal[j][i];
            }
        }

        // Impressão da matriz transposta
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
