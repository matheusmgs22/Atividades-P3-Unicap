package EstudandoPOO.ContaBancaria;

public class ContaBacaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBacaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s += "; nomeCliente: " + nomeCliente;
        s += "; numConta: " + numConta;
        s += "; saldo: " + saldo;
        s += "]";
        return s;
    }

    public boolean sacar(double valor){
        if( (this.saldo - valor) >= 0){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Erro, saldo insuficiente");
            return false;
        }

    }

    public void depositar(double valor){
        this.saldo += valor;

    }

}
