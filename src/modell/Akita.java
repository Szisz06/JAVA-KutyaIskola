package modell;

public class Akita extends Kutya{
    private double engedelmessegbolTeljesitett;

    private OrzoVedo orzoVedoFeladat;

    public Akita(String tulNeve, OrzoVedo orzoVedo) {
        super(tulNeve);
        this.engedelmessegbolTeljesitett = 0;
        this.orzoVedoFeladat = orzoVedo;
    }

    public Akita(String tulNeve) {this(tulNeve, OrzoVedo.NINCS);}

    public void orzoVedo() {
        int currentOrdinal = orzoVedoFeladat.ordinal();
        int nextOrdinal = (currentOrdinal + 1) % OrzoVedo.values().length;
        if (nextOrdinal == 0) {
            orzoVedoFeladat = OrzoVedo.values()[1];
        } else {
            orzoVedoFeladat = OrzoVedo.values()[currentOrdinal + 1];
        }
    }
    public void setEngedelmessegbolTeljesitett() {
        this.engedelmessegbolTeljesitett += 2.5;
        if (this.engedelmessegbolTeljesitett > 100)
            this.engedelmessegbolTeljesitett = 100;
    }

    @Override
    public void fut(Foglalkozas foglalkozas){
            super.fut(foglalkozas);
            switch (foglalkozas){
                case ENGEDELMESSEG -> {
                    setEngedelmessegbolTeljesitett();
                    break;
                }case ORZOVEDO -> {
                    orzoVedo();
                }
            }this.setFaradt(true);
    }

    @Override
    public String toString() {
        return "Akita kutya: " + "tulajdonos neve= " + getTulNeve() +
                ", engedelmességből teljesített= " + engedelmessegbolTeljesitett +
                " Utoljára végzett foglalkozás: " + getUtolsoFoglalkozas() + "," +
                " Utoljára tanult feladat: "+ orzoVedoFeladat + ", "+
                (isFaradt() ? " elfáradt": " még nem fáradt el")  ;


    }
}