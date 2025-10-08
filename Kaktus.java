package Inlämningsuppgift1;

public final class Kaktus extends Plant {
    private static final double DagligLiter = 0.02;

    public Kaktus(String namn, double höjdMeter) {
        super(namn, höjdMeter);
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VätskeTyp.MINERALVATTEN;
    }

    @Override
    public double getDagligVätskaLitar() {
        return DagligLiter;
    }
}
