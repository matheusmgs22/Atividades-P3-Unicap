package AtividadesDisciplinaP3.Revisao1;

import java.util.Scanner;

public class DivisivelPor3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
         * Faça um programa que conte quantos números divisíveis por 3 existem
         * em um intervalo dado pelo usuário, sendo o intervalo o mínimo e o
         * máximo.
         */

        int x = 0;

        System.out.println("Digite um valor minimo: ");
        int valorMinimo = sc.nextInt();

        System.out.println("Digite um valor maximo: ");
        int valorMaximo = sc.nextInt();

        if ((x % 3) == 0) {
            System.out.println(x);
        }

    }

}
