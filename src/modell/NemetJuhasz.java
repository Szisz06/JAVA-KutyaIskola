package modell;

public class NemetJuhasz extends Kutya{
    private double engedelmessegbolTeljesitett;
    private Agility agilityFeladat;
    private OrzoVedo orzoVedoFeladat;

    public NemetJuhasz(String tulNeve, OrzoVedo orzoVedo, Agility agility) {
        super(tulNeve);
        this.engedelmessegbolTeljesitett = 0;
        this.agilityFeladat = agility;
        this.orzoVedoFeladat = orzoVedo;
    }

    public NemetJuhasz(String tulNeve) {this(tulNeve, OrzoVedo.NINCS, Agility.NINCS);}


    public void orzoVedo() {
        int currentOrdinal = orzoVedoFeladat.ordinal();
        int nextOrdinal = (currentOrdinal + 1) % OrzoVedo.values().length;
        if (nextOrdinal == 0) {
            orzoVedoFeladat = OrzoVedo.values()[1];
        } else {
            orzoVedoFeladat = OrzoVedo.values()[currentOrdinal + 1];
        }
    }

    public void agility() {
        int currentOrdinal = agilityFeladat.ordinal();
        int nextOrdinal = (currentOrdinal + 1) % Agility.values().length;
        if (nextOrdinal == 0) {
            agilityFeladat = Agility.values()[1];
        } else {
            agilityFeladat = Agility.values()[currentOrdinal + 1];
        }
    }
    public void setEngedelmessegbolTeljesitett() {
        this.engedelmessegbolTeljesitett += 5;
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
                }case AGILITY -> {
                    agility();
                }case ORZOVEDO -> {
                orzoVedo();
            }
        }
        this.setFaradt(true);
    }
    @Override
    public String toString() {
        return "Német Juhász kutya: " + "tulajdonos neve= " + getTulNeve() +
                ", engedelmességből teljesített= " + engedelmessegbolTeljesitett +
                ", Utoljára végzett foglalkozás: " + getUtolsoFoglalkozas()  +
                ", Utoljára tanult feladat: "+ orzoVedoFeladat +
                "," + (isFaradt() ? " elfáradt": " még nem fáradt el")  ;
    }
}
