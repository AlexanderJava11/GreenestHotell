package Inlämningsuppgift1;

/*
Köttätandeväxt använder basliter(0.1) + (PerMeterLiter(0.2) * getHöjdMeter()) = liter proteindrick per dag
 */

public final class KöttätandeVäxt extends Plant {
    private static final double BasLiter = 0.1;
    private static final double PerMeterLiter = 0.2;

    public KöttätandeVäxt(String namn, double höjdMeter) {
        super(namn, höjdMeter);
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VätskeTyp.PROTEINDRICK;
    }

    @Override
    public double getDagligVätskaLitar() {
        return BasLiter + (PerMeterLiter * getHöjdMeter());
    }
}
