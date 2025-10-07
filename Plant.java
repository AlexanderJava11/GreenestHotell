package Inlämningsuppgift1;

public abstract class Plant implements Vätskebehov {
    private final String namn;
    private double höjdMeter;

    protected Plant(String namn, double höjdMeter) {
        if (namn == null || namn.isBlank())
            throw new IllegalArgumentException("Namn krävs");
        if (höjdMeter <= 0)
            throw new IllegalArgumentException("Höjd måste vara positiv, inte negativ");
        this.namn = namn;
        this.höjdMeter = höjdMeter;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjdMeter() {
        return höjdMeter;
    }

    public void vattna() {
        double liter = getDagligVätskaLitar();
        double tillväxt = (liter / 0.1) * 0.01;
        höjdMeter += tillväxt;

    }

    public abstract double getDagligVätskaLitar();
}

