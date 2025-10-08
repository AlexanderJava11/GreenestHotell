package Inlämningsuppgift1;

public final class Palm extends Plant {
    private static final double LiterPerMeter = 0.5;

    public Palm(String namn, double höjdMeter) {
        super(namn, höjdMeter);
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VätskeTyp.KRANVATTEN;
    }

    @Override
    public double getDagligVätskaLitar() {
        return getHöjdMeter() * LiterPerMeter;
    }
}
