package EstudandoPOO.ContaBancaria;

public class testeContaBancaria {

    public static void main(String[] args) {

        /*
        System.out.println("*** TESTE CONTA BANCARIA ***");
        ContaBacaria contaSimples = new ContaBacaria("matheus", "1233-4", 0);

        System.out.println(contaSimples);

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        */

        ContaBacaria contaSimples = new ContaBacaria("matheus", "1233-4", 0);

        System.out.println(contaSimples);

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

    }

    private static void realizarSaque(ContaBacaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo + " + conta.getSaldo());
        }else{
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }

    }
}
