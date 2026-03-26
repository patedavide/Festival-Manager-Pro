import java.util.*;

public class FestivalManager {
    public static void main(String[] args) {
        // Suggerimento: Inizia da qui
        List<String> scaletta = new ArrayList<>();

        scaletta.add("Shiva");
        scaletta.add("Drake");
        scaletta.add("Bad Bunny");
        scaletta.add("Sfera Ebbasta");
        scaletta.add("Kendrick Lamar");

        scaletta.remove("Drake");
        scaletta.add(1, "Ospite a Sorpresa");

        //Stampa scaletta
        System.out.println("Scaletta festival:");
        for (int i = 0; i < scaletta.size(); i++) {
            System.out.println((i+1) + "." + scaletta.get(i));
        }

        //Scaletta con artista duplicato
        scaletta.add("Bad Bunny");
        System.out.println("Scaletta festival con arista duplicato:");
        for (int i = 0; i < scaletta.size(); i++) {
            System.out.println((i+1) + "." + scaletta.get(i));
        }

        Set<String> bigliettiValidati = new HashSet<>();



    }
}

