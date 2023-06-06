package EstudandoPOO.ContaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBacaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca[";
        s += " diaRendimento: " + diaRendimento;
        s += super.toString();
        s += "]" ;
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){ // atualiza o novo saldo

        Calendar hoje  = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
           // saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }else{
            return false;
        }
    }
}

