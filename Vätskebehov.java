package Inlämningsuppgift1;

/*
Interface som definierar vad alla växter.
Används med polymorfism
 */

public interface Vätskebehov {
    VätskeTyp getVätskeTyp();
    double getDagligVätskaLitar();
    String getNamn();
}
