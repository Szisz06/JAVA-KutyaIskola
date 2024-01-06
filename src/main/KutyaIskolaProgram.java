package main;

import modell.*;

public class KutyaIskolaProgram {
    private  KutyaIskola iskola;



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

        System.out.println("--- Dóri, Sziszi és Alexa kivette a kutyáját");
        iskola.kiad("Dóri");
        iskola.kiad("Sziszi");
        iskola.kiad("Alexa");
        System.out.println("--- A bentmaradt kutyák:");
        kutyakatKiir();

        System.out.println("--- Eszter beviszi a kutyáját agility képzésre");
        iskola.bevesz(new BorderCollie("Eszter"));
        System.out.println("--- Agility képzés UTÁN:");
        iskola.futtat(Foglalkozas.AGILITY);
        kutyakatKiir();

        System.out.println("--- Eszter és Péter kivette a kutyáját");
        iskola.kiad("Eszter");
        iskola.kiad("Péter");
        System.out.println("--- A bentmaradt kutyák:");
        kutyakatKiir();

        System.out.println("--- Anna beviszi a kutyáját örző-védő képzésre");
        iskola.bevesz(new Akita("Anna"));
        System.out.println("--- Örző-védő képzés UTÁN:");
        iskola.futtat(Foglalkozas.ORZOVEDO);
        kutyakatKiir();

        System.out.println("--- Anna kivette a kutyáját");
        iskola.kiad("Anna");
        System.out.println("--- A bentmaradt kutyák:");
        kutyakatKiir();

        System.out.println("--- Sanyi beviszi a kutyáját örző-védő képzésre");
        iskola.bevesz(new NemetJuhasz("Sanyi"));
        kutyakatKiir();

        System.out.println("--- Örző-védő képzés UTÁN:");
        iskola.futtat(Foglalkozas.ORZOVEDO);
        kutyakatKiir();

        System.out.println("--- 4 Örző-védő képzés:");
        for (int i = 0; i < 4; i++) {
            iskola.futtat(Foglalkozas.ORZOVEDO);
            kutyakatKiir();
        }
        iskola.kiad("Sanyi");
        kutyakatKiir();

        /*
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
        */

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