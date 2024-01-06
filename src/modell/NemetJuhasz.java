package modell;

public class NemetJuhasz extends Kutya{
    private double engedelmessegbolTeljesitett;

    public NemetJuhasz(String tulNeve) {
        super(tulNeve);
        this.engedelmessegbolTeljesitett = 0;
    }

    public double getEngedelmessegbolTeljesitett() {
        return engedelmessegbolTeljesitett;
    }

    public void setEngedelmessegbolTeljesitett() {
        this.engedelmessegbolTeljesitett += 5;
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
        return "Német Juhász kutya " + "tulajdonos neve = " + getTulNeve()+  ", " + (isFaradt() ? "elfáradt": "még nem fáradt el")  + ", engedelmességből teljesített = " + engedelmessegbolTeljesitett;
    }
}