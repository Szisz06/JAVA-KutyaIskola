package modell;

public class Akita extends Kutya{
    private double engedelmessegbolTeljesitett;

    public Akita(String tulNeve) {
        super(tulNeve);
        this.engedelmessegbolTeljesitett = 0;
    }

    public double getEngedelmessegbolTeljesitett() {
        return engedelmessegbolTeljesitett;
    }

    public void setEngedelmessegbolTeljesitett() {
        this.engedelmessegbolTeljesitett += 2.5;
        if (this.engedelmessegbolTeljesitett > 100)
            this.engedelmessegbolTeljesitett = 100;
    }

    public void fut(Foglalkozas foglalkozas){
        this.setFaradt(true);
        switch (foglalkozas){
            case ENGEDELMESSEG -> {
                setEngedelmessegbolTeljesitett();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Akita kutya: " + "tulajdonos neve= " + getTulNeve() + ", engedelmességből teljesített= " + engedelmessegbolTeljesitett + "," + (isFaradt() ? " elfáradt": " még nem fáradt el")  ;


    }
}