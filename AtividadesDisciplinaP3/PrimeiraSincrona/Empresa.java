package AtividadesDisciplinaP3.PrimeiraSincrona;

public class Empresa{

    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores;
    private int numeroDeFuncionarios;
    private String endereco;
    private String ceo;


public Empresa(String nome, String cnpj, String endereco, String ceo){

        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.ceo = ceo;
        this.numeroDeFuncionarios = -1;
        trabalhadores = new Trabalhador [20];

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Trabalhador[] getTrabalhadores() {
        return trabalhadores;
    }

    public void setTrabalhadores(Trabalhador[] trabalhadores) {
        this.trabalhadores = trabalhadores;
    }
    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCeo() {
        return ceo;
    }

public void setCeo(String ceo) {
        this.ceo = ceo;
}

public void contratar (Trabalhador _trabalhadores){
    this.numeroDeFuncionarios++;

    trabalhadores[numeroDeFuncionarios] = _trabalhadores;

}

public void trabalhar(){

    for(int i = 0; i <= this.numeroDeFuncionarios; i++ ){
        if(trabalhadores[i].getFerias() == false){
            trabalhadores[i].setHorasTrabalhadas(8);
        }

        }
    }

    public void pagamento(){
        String [] nomeFuncionario =  new String[20];
        double [] salarioFuncionario = new double [20];
        double aux = 0;

        for(int i = 0; i <= this.numeroDeFuncionarios; i++){
            nomeFuncionario[i] = trabalhadores[i].getNome();
            salarioFuncionario[i] = trabalhadores[i].getHorasTrabalhadas() * trabalhadores[i].getValorHora();
        }

        for(int j = 0; j <= this.numeroDeFuncionarios; j++){
            aux = aux + salarioFuncionario[j];

        }
        System.out.println("A empresa irá gastar um total de: " + aux);
    }
}

