import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;

public class ListaDeCarros {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();

        Carro carro1 = new Carro("Panamera", "Porsche", 300);
        Carro carro2 = new Carro("GT-R", "Nissan", 480);
        Carro carro3 = new Carro("Ka", "Ford", 80);
        Carro carro4 = new Carro("Argo", "Fiat", 90);

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);

        System.out.println("Sem ordernação");
        System.out.println(carros);

        System.out.println("\n===============\n");

        System.out.println("Com ordernação");
        Collections.sort(carros);
        System.out.println(carros);

        System.out.println("\n===============\n");

        System.out.println("Com ordernação inversa");
        Collections.sort(carros, Collections.reverseOrder());
        System.out.println(carros);

        System.out.println("\n===============\n");

        Comparator<Carro> comparadorCavalos = new Comparator<Carro>() {
            @Override
            public int compare(Carro c1, Carro c2) {
                return Double.compare(c1.getCavalos(), c2.getCavalos());
            }
        };

        System.out.println("Utilizando comparator como classe anônima");
        Collections.sort(carros, comparadorCavalos);
        System.out.println(carros);

        System.out.println("\n===============\n");
        System.out.println("Utilizando comparator como classe anônima 2");
        Collections.sort(carros, new Comparator<Carro>() {
            @Override
            public int compare(Carro c1, Carro c2) {
                return Double.compare(c2.getCavalos(), c1.getCavalos());
            }
        });
        System.out.println(carros);

        System.out.println("\n===============\n");
        Collections.sort(carros, Comparator.comparing(Carro::getCavalos));
        System.out.println(carros);

        System.out.println("\n===============\n");
        carros.add(new Carro("Veyron", "Bugatti", 480));

        carros.sort(comparing(Carro::getCavalos).thenComparing(Carro::getFabricante));
        System.out.println(carros);

        System.out.println("\n===============\n");

        carros.sort(comparing(Carro::getCavalos).reversed().thenComparing(Carro::getFabricante));
        System.out.println(carros);
    }
}
