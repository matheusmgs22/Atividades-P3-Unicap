package exemplo1;

import java.util.Scanner;


public class Main {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);


        Pessoa pessoa [] = new Pessoa[5];
        pessoa[0] = new Pessoa("Maria", 90);
        pessoa[1] = new Pessoa("Vilma", 18);
        pessoa[2] = new Pessoa("robson", 13);
        pessoa[3] = new Pessoa("velma", 33);
        pessoa[4] = new Pessoa("hibson", 22);

        for(int i = 0; i < pessoa.length; i++){
            System.out.println("Nome:" + pessoa[i].getNome() + " Idade" + pessoa[i].getIdade());

        }
    }

}
