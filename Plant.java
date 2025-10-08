package Inlämningsuppgift1;

public abstract class Plant implements Vätskebehov {

    // Inkapsling - privata fält. Kan endast nås via getters
    private final String namn;
    private final double höjdMeter;

    protected Plant(String namn, double höjdMeter) {
        if (namn == null || namn.isBlank())
            throw new IllegalArgumentException("Namn krävs");
        if (höjdMeter <= 0)
            throw new IllegalArgumentException("Höjd måste vara positiv, inte negativ");
        this.namn = namn.trim();
        this.höjdMeter = höjdMeter;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjdMeter() {
        return höjdMeter;
    }

    // Abstrakt metod som tvingar subklasser att implementera sina egna beräkningar
    public abstract double getDagligVätskaLitar();

}

