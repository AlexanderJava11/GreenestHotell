package Inlämningsuppgift1;

/*
Enum som visar vilken vätska växten får / VG delen
 */

public enum VätskeTyp {
    KRANVATTEN("Kranvatten"),
    MINERALVATTEN("Mineralvatten"),
    PROTEINDRICK("Proteindryck");

    private final String display;

    VätskeTyp(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}