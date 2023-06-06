package EstudandoPOO.exemplo2;

import java.util.List;

public class Calcular {

    public double media(List<? extends Produto> list){

        double soma = 0;
        for(int i = 0; i < list.size(); i++){
            soma = soma+list.get(i).getPreco();
        }
        return soma/list.size();
    }

}
