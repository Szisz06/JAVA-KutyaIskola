package modell;

public abstract class Kutya {
    private String tulNeve;
    private boolean faradt;
    private Foglalkozas foglalkozas;

    public Kutya(String tulNeve) {
        this.tulNeve = tulNeve;
        faradt = false;
        foglalkozas = Foglalkozas.ENGEDELMESSEG;
    }

    public String getTulNeve() {
        return tulNeve;
    }

    public void setTulNeve(String tulNeve) {
        this.tulNeve = tulNeve;
    }

    public boolean isFaradt() {
        return faradt;
    }

    public void setFaradt(boolean faradt) {
        this.faradt = faradt;
    }

     void fut(Foglalkozas foglalkozas) {
        this.foglalkozas = foglalkozas;
     }

     Foglalkozas getUtolsoFoglalkozas() {
        return this.foglalkozas;
     }
    @Override
    public String toString() {
        return "Kutya{" + "tulNeve=" + tulNeve + ", fáradt?=" + faradt + '}';
    }
}



