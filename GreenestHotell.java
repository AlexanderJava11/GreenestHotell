package Inlämningsuppgift1;

import java.text.DecimalFormat;
import java.util.*;

public class GreenestHotell {

    private static final String Växt = "Vilken växt ska få vätska? Skriv namn eller 'lista' eller 'avsluta'";
    private static final String Okänd = "Okänt namn. Tillgängliga växter: ";
    private static final String Avsluta = "Hejdå \uD83E\uDEB4";
    private static final String Liter = " liter ";
    private static final String Per_Dag = " per dag.";

    public static void main(String[] args) {
        List<Plant> plants = List.of(
                new Kaktus("Igge", 0.2),
                new Palm("Laura", 5.0),
                new KöttätandeVäxt("Meatloaf", 0.7),
                new Palm ("Olof", 1.0));

        Map<String, Plant> byName = new HashMap<>();
        for (Plant p : plants) byName.put(p.getNamn().toLowerCase(Locale.ROOT), p);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(Växt);
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("avsluta")) {
                    System.out.println(Avsluta);
                    return;
                }
                if (input.equalsIgnoreCase("lista")) {
                    System.out.println(String.join(", ", plants.stream().map(Plant::getNamn).toList()));
                    continue;
                }
                if (input.isBlank())
                    continue;

                Plant selected = byName.get(input.toLowerCase(Locale.ROOT));
                if (selected == null) {
                    System.out.println(Okänd + String.join(", ", plants.stream().map(Plant::getNamn).toList()));
                    continue;
                }

                double liters = selected.getDagligVätskaLitar();
                String Vätska = selected.getVätskeTyp().getDisplay();

                System.out.println(
                        selected.getNamn() + " ska ha " + decimalFormat.format(liters) + Liter + Vätska + Per_Dag);
            }
        }
    }
}
