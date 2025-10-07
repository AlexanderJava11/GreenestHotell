package Inlämningsuppgift1;

import java.text.DecimalFormat;
import java.util.List;

public class Simulering {
    public static void main(String[] args) {
        List<Plant> växter = List.of(
                new Kaktus("Igge", 0.20),
                new Palm("Laura", 5.0),
                new KöttätandeVäxt("Meatloaf", 0.70),
                new Palm("Olof", 1.0));

        DecimalFormat decimalFormat = new DecimalFormat("#,##");

        for (int dag = 1; dag <= 10; dag++) {
            System.out.println("Dag " + dag + ":");
            for (Plant x : växter) {
                x.vattna();
                System.out.println(" " + x.getNamn() + " växer till " + decimalFormat.format(x.getHöjdMeter()) + " m");

            }
            System.out.println();
        }
    }
}
