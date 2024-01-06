package main;

import modell.KutyaIskola;
import modell.Kutya;

public class KutyaIskolaProgram {
    private KutyaIskola iskola;

    public static void main(String[] args) {
        new KutyaIskolaProgram();
    }

    public KutyaIskolaProgram() {
        iskola = new KutyaIskola(9);
        iskola.bevesz(new Kutya("Péter"));
        iskola.bevesz(new Kutya("Sziszi"));
        iskola.bevesz(new Kutya("Alexa"));
        iskola.bevesz(new Kutya("Dóri"));

        System.out.println("--- futtatás ELŐTT:");
        kutyakatKiir();

        System.out.println("--- futtatás UTÁN:");
        iskola.fut();
        kutyakatKiir();

        System.out.println("--- Sziszi és Alexa kivette a kutyáját");
        iskola.kiad("Sziszi");
        iskola.kiad("Alexa");
        System.out.println("--- A bentmaradt kutyák:");
        kutyakatKiir();
    }

    private void kutyakatKiir() {
        for (String kutya : iskola.getKutyakLeirasa()) {
            if(kutya != null){
                System.out.println(kutya);
            }
        }
    }

}