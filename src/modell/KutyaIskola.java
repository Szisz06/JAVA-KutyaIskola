package modell;

public class KutyaIskola {
    private Kutya[] kutyak;
    private int kutyaDb;
    public KutyaIskola() {
        this(10);
    }

    public KutyaIskola( int db) {
        kutyaDb = 0;
        kutyak = new Kutya[db];
    }
    public void bevesz(Kutya kutya){
        if(kutyaDb < kutyak.length){
            kutyak[kutyaDb++] = kutya;
        }else{
            System.out.println("Az futtató megtelt!");
        }
    }
    public void futtat(Foglalkozas foglalkozas){
        for (Kutya kutya : kutyak) {
            if(kutya != null){
                kutya.fut(foglalkozas);
            }
        }
    }
    public void kiad(String tulNeve){
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
}