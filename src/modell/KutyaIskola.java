package modell;

public class KutyaIskola {
    private Kutya[] kutyak;
    private int kutyaDb;

    public boolean mukodik;

    public KutyaIskola() {
        this(10);
    }

    public KutyaIskola( int db) {
        kutyaDb = 0;
        kutyak = new Kutya[db];
        mukodik = true;
    }
    public void bevesz(Kutya kutya){
        if (mukodik){
            if(kutyaDb < kutyak.length){
                kutyak[kutyaDb++] = kutya;
            }else{
                System.out.println("Az futtató megtelt!");
            }
        }else {
            System.out.println("A futtató bezárt, nem tudunk új kutyát bevenni!");
        }
    }
    public void futtat(Foglalkozas foglalkozas){
        if (mukodik){
            for (Kutya kutya : kutyak) {
                if(kutya != null){
                    kutya.fut(foglalkozas);
                }
            }
        } else {
            System.out.println("A futtató bezárt, így nem tudunk képzést indítani!");
        }
    }
    public void kiad(String tulNeve){
        if (mukodik){
            int i = 0;
            while(kutyak[i] == null || i < kutyaDb && !(kutyak[i].getTulNeve().equals(tulNeve))){
                i++;
            }
            if(i < kutyaDb){
                System.out.println(String.format("Kiadva %s kutyája!", tulNeve));
                kutyak[i] = null;
            }else{
                System.out.println("Nincs ilyen kutya a futtatóban!");
            }
        } else{
            System.out.println("A futtató bezárt, a bent lévő kutyák elszöktek \nígy nincs kutya amit ki tudnánk adni!");
        }
    }
    public String[] getKutyakLeirasa() {
        String[] kutyak = new String[this.kutyak.length];
        for (int i = 0; i < kutyaDb; i++) {
            Kutya r = this.kutyak[i];
            if(r != null){
                kutyak[i] = r.toString();
            }
        }
        return kutyak;
    }
    public void termeszetiKatasztrofa(){
        mukodik = false;
        kutyak = new Kutya[10];
    }
}