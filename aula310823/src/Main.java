import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Criando ArrayList carros
        ArrayList<String> carros = new ArrayList<>();

        String carro1 = "Porsche Panamera";
        String carro2 = "Lamborghini Aventador";
        String carro3 = "Golf GTI";

        // Adicionando carros no ArrayList
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        // Imprimindo o ArrayList
        System.out.println(carros);

        System.out.println("\n===============\n");

        // Removendo elementos do ArrayList via index e object
        carros.remove(0);
        carros.remove(carro2);

        System.out.println(carros);

        // Adicionando carros no ArrayList
        carros.add(carro1);
        carros.add("Nissan GT-R");

        System.out.println("\n===============\n");

        // Percorrendo o ArrayList e imprimindo seus elementos
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

        System.out.println("\n===============\n");

        // Percorendo o ArrayList com for aprimorado e imprimindo seus elementos
        for (String carro : carros) {
            System.out.println(carro);
        }

        System.out.println("\n===============\n");

        // Percorrendo o ArrayList com forEach e imprimindo seus elementos
        carros.forEach(carro -> {
            System.out.println(carro);
        });

        System.out.println("\n===============\n");

        // Ordernando o ArrayList com a classe Collections e o método sort()
        Collections.sort(carros);
        System.out.println(carros);

        System.out.println("\n===============\n");

        // Reverse order
        Collections.sort(carros, Collections.reverseOrder());
        System.out.println(carros);
    }
}
