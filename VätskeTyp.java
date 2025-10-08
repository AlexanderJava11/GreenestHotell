package Inlämningsuppgift1;

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