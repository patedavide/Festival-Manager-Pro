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

        Set<String> ticketCodex = new HashSet<>();

        ticketCodex.add("TICK-001");
        ticketCodex.add("TICK-042");
        ticketCodex.add("TICK-777");
        ticketCodex.add("TICK-095");
        ticketCodex.add("TICK-007");

        boolean duplicato = ticketCodex.add("TICK-001");
        System.out.println("Biglietto duplicato: " + duplicato);
        System.out.println("Numero Partecipanti: " + ticketCodex.size());

        System.out.println("Biglietti disordinati: ");
        for (String ticket: ticketCodex){
            System.out.println(ticket);
        }

        Set<String> bigliettiOrdinati = new TreeSet<>(ticketCodex);
        System.out.println("Biglietti Ordinati: " + bigliettiOrdinati);

        Map<String, String> registroPartecipanti = new HashMap<>();

        registroPartecipanti.put("TICK-001", "Ilario SUardi");
        registroPartecipanti.put("TICK-042", "Zakaria El Haiki");
        registroPartecipanti.put("TICK-777", "Davide Paternò");
        registroPartecipanti.put("TICK-095", "Giacomo Rota");
        registroPartecipanti.put("TICK-007", "Federico Mazzoleni");

        cercaPartecipante(registroPartecipanti, "TICK-042");
        cercaPartecipante(registroPartecipanti, "TICK-006");

        System.out.println("Elenco partecipanti: ");
        for (Map.Entry<String, String > entry: registroPartecipanti.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void cercaPartecipante(Map<String, String> mappa, String codice){
        if(mappa.containsKey(codice)){
            System.out.println("Benvenuto, " + mappa.get(codice));
        } else {
            System.out.println("Codide non valido: " + codice);
        }
    }
}

