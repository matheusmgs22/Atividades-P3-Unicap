package EstudandoPOO.ContaCorrente;

public class TesteContaCorrente {

    public static void main(String[] args) {

    ContaCorrente conta = new ContaCorrente();

    conta.setNumero("10.000");
    conta.setAgencia("1");
    conta.setEspecial(true);
    conta.setLimiteEspecial(500);
    conta.setSaldo(-10);

    System.out.println("Saldo na conta " + conta.getNumero() + " = " + conta.getSaldo());

    boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!!");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar o saque, saldo insuficiente. ");
        }

    System.out.println("Deposito de 500 reais");
    conta.depositar(500);
    conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        }else{
            System.out.println("Nao esta usando cheque especial");
        }
    }
}
