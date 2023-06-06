package AtividadesDisciplinaP3.Revisao1;

import java.util.Scanner;

public class MaiorParaMenor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
         * Faça um programa que, dado 3 números digitados pelo usuário, ordene
         * eles do menor para o maior.
         */

        System.out.println("Digite o Primero numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o Segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.println("Digite o Terceiro numero: ");
        int numero3 = sc.nextInt();

        if (numero1 <= numero2 && numero2 <= numero3) {
            System.out.println("A ordem crescente: " + numero1 + " | " + numero2 + " | " + numero3);

        } else if (numero1 <= numero3 && numero3 <= numero2) {
            System.out.println("A ordem crescente: " + numero1 + " | " + numero3 + " | " + numero2);

        } else if (numero2 <= numero1 && numero1 <= numero3) {
            System.out.println("A ordem crescente: " + numero2 + " | " + numero1 + " | " + numero3);

        } else if (numero2 <= numero3 && numero3 <= numero1) {
            System.out.println("A ordem crescente: " + numero2 + " | " + numero3 + " | " + numero1);

        } else if (numero3 <= numero1 && numero1 <= numero2) {
            System.out.println("A ordem crescente: " + numero3 + " | " + numero1 + " | " + numero2);

        } else {
            System.out.println("A ordem crescente: " + numero3 + " | " + numero2 + " | " + numero1);
        }
    }

}
