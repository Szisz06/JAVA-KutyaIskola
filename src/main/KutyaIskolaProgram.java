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

        System.out.println("--- Dóri kivette a kutyáját");
        iskola.kiad("Dóri");
        System.out.println("--- A bentmaradt kutyák:");
        kutyakatKiir();

        for (int i = 0; i < 15; i++) {
            iskola.futtat(Foglalkozas.ENGEDELMESSEG);
        }
        System.out.println("--- 17 engedelmességi képzés UTÁN:");
        iskola.futtat(Foglalkozas.ENGEDELMESSEG);
        kutyakatKiir();

        System.out.println("--- A kutyaiskola természeti katasztrófát szenvedett!");
        iskola.termeszetiKatasztrofa();
        kutyakatKiir();

        System.out.println("--- Viola elviszi a kutyáját az iskolába:");
        iskola.bevesz(new BorderCollie("Viola"));
        iskola.futtat(Foglalkozas.ENGEDELMESSEG);
        iskola.kiad("Sziszi");

    }

    private void kutyakatKiir() {
        if (iskola.mukodik){
            for (String kutya : iskola.getKutyakLeirasa()) {
                if(kutya != null){
                    System.out.println(kutya);
                }
            }
        } else {
            System.out.println("Nincs kutya az iskolába, a természeti katasztrófa megrongálta \na kerítést a bent lévő kutyák elszöktek :(");
        }
    }



}