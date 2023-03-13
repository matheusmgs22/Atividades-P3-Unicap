import java.util.Scanner;

public class Atividade1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        // 1) Faça um programa que verifique se um número é par ou ímpar.

        System.out.println("Digite o número: ");
        int numero = sc.nextInt();

        if ( (numero % 2) == 0){
            System.out.println(numero + " --> É PAR");

        }else if((numero % 2) == 1){
            System.out.println(numero + " --> É IMPAR");
        }
        
    }

}