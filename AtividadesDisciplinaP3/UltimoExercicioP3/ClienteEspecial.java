package AtividadesDisciplinaP3.UltimoExercicioP3;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ClienteEspecial extends Cliente {
    private Investimento investimento;

    public ClienteEspecial(String nome, int idade, String conta, String agencia, double saldo, Operacao[] historico,
            Investimento investimento) {
        super(nome, idade, conta, agencia, saldo, historico);

        this.investimento = investimento;
    }

    public Investimento getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }

    @Override
    public void extrato() {

        Operacao[] extrato = Arrays.copyOfRange(getHistorico(), 0, getQuantOperacoes());

        for (Operacao operacao : extrato) {

            System.out.println(operacao);

        }
    }

    public void investimento(LocalDateTime dataHora, double valorInvestido, double percentual) throws Exception{
        if (valorInvestido > getSaldo()) {
            throw new Exception("Saldo insuficiente para investimento.");
        }

        double rendimento = valorInvestido * percentual / 100.0;
        //getSaldo() -= valorInvestido;

        double valorFinal = valorInvestido + rendimento;



    }

}
