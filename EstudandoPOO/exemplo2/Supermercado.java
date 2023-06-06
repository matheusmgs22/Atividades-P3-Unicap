package EstudandoPOO.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    public static void main(String args[]){
    Calcular cal = new Calcular();

        List<Shampoo> shampoo = new ArrayList<>();
        shampoo.add(new Shampoo("Dove", 4.12, "02/02/02", 6));
        shampoo.add(new Shampoo("Palmolive", 2.12, "03/04/04", 8));
        shampoo.add(new Shampoo("Rexona", 3.12, "01/01/22", 7));
        shampoo.add(new Shampoo("OMO", 1.12, "02/02/02", 9));
        shampoo.add(new Shampoo("Granado", 11.12, "08/04/22", 1));


        System.out.println("Media: " + cal.media(shampoo));

        List<Biscoito> biscoito = new ArrayList<>();
        biscoito.add(new Biscoito("Oreo", 4.12, "08/04/22", 5));
        biscoito.add(new Biscoito("Traquinas", 1.12, "08/04/22", 4));
        biscoito.add(new Biscoito("Treloso", 0.12, "08/04/22", 3));
        biscoito.add(new Biscoito("Agua e sal", 10.12, "08/04/22", 1));
        biscoito.add(new Biscoito("Gica", 5.12, "08/04/22", 8));

        System.out.println("Media: " + cal.media(biscoito));

        List<Leite> leite = new ArrayList<>();
        leite.add(new Leite("Milka Da Vaca", 4.59, "08/04/22", 21));
        leite.add(new Leite("Milka Do bode ", 24.0  , "08/04/22", 1 ));
        leite.add(new Leite("Milka Da galinha", 3.10, "08/04/22", 2));
        leite.add(new Leite("Milka Do Mamute", 10.10, "08/04/22", 3));
        leite.add(new Leite("Milka Da Cabra", 2.10, "08/04/22", 4));

         System.out.println("Media: " + cal.media(leite));

    }
}
