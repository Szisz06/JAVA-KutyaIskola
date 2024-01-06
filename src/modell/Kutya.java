package modell;

public abstract class Kutya {
    private String tulNeve;
    private boolean faradt;

    public Kutya(String tulNeve) {
        this.tulNeve = tulNeve;
        faradt = false;
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

     abstract void fut(Foglalkozas foglalkozas);

    @Override
    public String toString() {
        return "Kutya{" + "tulNeve=" + tulNeve + ", fáradt?=" + faradt + '}';
    }
}



