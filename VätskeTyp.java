package Inlämningsuppgift1;

public enum VätskeTyp {
    KranVatten("Kranvatten"),
    MineralVatten("Mineralvatten"),
    ProteinDryck("Proteindryck");

    private final String display;

    VätskeTyp(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}