package main;

import modell.*;

public class KutyaIskolaProgram {
    private KutyaIskola iskola;

    public static void main(String[] args) {
        new KutyaIskolaProgram();
    }

    public KutyaIskolaProgram() {
        iskola = new KutyaIskola(9);
        iskola.bevesz(new Akita("Péter"));
        iskola.bevesz(new BorderCollie("Sziszi"));
        iskola.bevesz(new NemetJuhasz("Alexa"));
        iskola.bevesz(new Akita("Dóri"));

        System.out.println("--- futtatás ELŐTT:");
        kutyakatKiir();

        System.out.println("--- futtatás UTÁN:");
        iskola.futtat(Foglalkozas.ENGEDELMESSEG);
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