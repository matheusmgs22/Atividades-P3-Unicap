package AtividadesDisciplinaP3.UltimoExercicioP3;

import java.util.Arrays;

public class Cliente {

    private String nome;
    private int idade;
    private String conta;
    private String agencia;
    private double saldo;
    private Operacao[] historico;
    private int quantOperacoes;



    public Cliente(String nome, int idade, String conta, String agencia, double saldo, Operacao[] historico) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.historico = new Operacao[30];
        this.quantOperacoes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    // a23

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Operacao[] getHistorico() {
        return historico;
    }

    public void setHistorico(Operacao[] historico) {
        this.historico = historico;
    }

    public int getQuantOperacoes() {
        return quantOperacoes;
    }

    public void setQuantOperacoes(int quantOperacoes) {
        this.quantOperacoes = quantOperacoes;
    }

    public void depositar(String data, String hora, double valor) {
        this.saldo += valor;
    }

    public void sacar(String data, String hora, double valor) throws Exception {
        if (this.saldo >= 0) {
            this.saldo -= valor;
        } else {
            throw new Exception("Saldo insuficiente para saque.");
        }
    }

    public void extrato() {

        // Imprimir as operações mais recentes
        Operacao[] extrato = Arrays.copyOfRange(historico, 0, quantOperacoes);

        for (Operacao operacao : extrato) {
            // Atualizar vetor de operações
            if (quantOperacoes == 10) {
                // Se o vetor estiver cheio, remover a operação mais antiga
                System.arraycopy(quantOperacoes, 1, historico, 0, quantOperacoes - 1);
                historico[quantOperacoes - 1] = operacao;
            } else {
                // Se o vetor ainda tiver espaço, adicionar a nova operação
                historico[quantOperacoes] = operacao;
                quantOperacoes++;
            }

            System.out.println(operacao);

        }
    }

}
