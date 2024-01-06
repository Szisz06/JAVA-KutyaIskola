package modell;

public class BorderCollie extends Kutya{
    private double engedelmessegbolTeljesitett;
    private Agility agilityFeladat;

    public BorderCollie(String tulNeve, Agility agility) {
        super(tulNeve);
        this.engedelmessegbolTeljesitett = 0.0;
        this.agilityFeladat = agility;
    }
    public BorderCollie(String tulNeve) {this(tulNeve, Agility.NINCS);}
    public double getEngedelmessegbolTeljesitett() {
        return engedelmessegbolTeljesitett;
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
        this.engedelmessegbolTeljesitett += 7.5;
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
                }
            }
        this.setFaradt(true);
    }
    @Override
    public String toString() {
        return "Border Collie kutya: " + "tulajdonos neve= " + getTulNeve() +
                ", engedelmességből teljesített= " + engedelmessegbolTeljesitett +
                " Utoljára végzett foglalkozás: " + getUtolsoFoglalkozas() + "," +
                " Utoljára tanult feladat: "+ agilityFeladat + ", "+
                (isFaradt() ? " elfáradt": " még nem fáradt el")  ;

    }
}
