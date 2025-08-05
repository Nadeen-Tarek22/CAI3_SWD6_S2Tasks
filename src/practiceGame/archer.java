package practiceGame;

public class archer extends player{
    int archerPower;


    public archer(String name, String role,int health, int archerPower ){
        super(name, role, health);
        this.archerPower=archerPower;
    }

    @Override
    public void attack() {
        System.out.println("Archer attacks using an Arch");
    }

    @Override
    public void defend() {
        System.out.println("Archer defend using his hands");
    }
}
