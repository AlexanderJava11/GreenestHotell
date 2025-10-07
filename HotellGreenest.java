package Inlämningsuppgift1;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class HotellGreenest {
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("sv", "SE"));
        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(2);

        List<Vätskebehov> plants = List.of(
                new Kaktus("Igge", 0.20),
                new Palm("Laura", 5.0),
                new KöttätandeVäxt("Meatloaf", 0.70),
                new Palm("Olof", 1.0));

        Map<String, Vätskebehov> byNamn = new HashMap<>();
        plants.forEach(p -> byNamn.put(p.getNamn().toLowerCase(Locale.ROOT), p));
        String options = String.join(", ", plants.stream().map(Vätskebehov::getNamn).sorted().toList());

        while (true) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Vilken växt ska få vätska?",
                    "Greenest - servering",
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                return;
            }

            Vätskebehov vätskebehov = byNamn.get(input.trim().toLowerCase(Locale.ROOT));
            if (vätskebehov == null) {
                JOptionPane.showInputDialog(
                        null,
                        "Okänd växt. Försök med: " + options,
                        "Hittade int växten",
                        JOptionPane.WARNING_MESSAGE);
                continue;
            }


            String liters = nf.format(vätskebehov.getDagligVätskaLitar());
            String flytande = vätskebehov.getVätskeTyp().getDisplay();

            String msg = vätskebehov.getNamn() + " ska ha " + liters + " liter " + flytande + " per dag.";
            JOptionPane.showInputDialog(
                    null,
                    msg,
                    "Servering",
                    JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }
}
