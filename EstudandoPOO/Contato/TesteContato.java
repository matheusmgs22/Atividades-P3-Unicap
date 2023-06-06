package EstudandoPOO.Contato;

public class TesteContato {

    public static void main(String[] args) {


    Contato contato = new Contato();
    contato.setNome("tomore");
    contato.setTelefone("81 99998999");
   // contato.setEndereco("Avenida rua de gomes rua");

   // criar o objeto endereco

   Endereco end = new Endereco();

     end.setNomeRua("Rua Bartolomeu figado");
     end.setCep("50201000");
     end.setCidade("California");
     end.setComplemento("CASA B102");
     end.setEstado("Babilonia");

     contato.setEndereco(end);

    System.out.println(contato.getNome());
    System.out.println(contato.getTelefone());
    System.out.println(contato.getEndereco());


    }
}
