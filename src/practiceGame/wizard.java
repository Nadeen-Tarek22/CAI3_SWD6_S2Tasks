package practiceGame;

public class wizard extends player implements magicalInterface{
    String tool;
    public wizard(String name, String role, int health, String tool){
        super(name, role, health);
        this.tool=tool;
    }
    @Override
    public void attack() {
        System.out.println("wizard attacks using a magic tool");
    }

    @Override
    public void defend() {
        System.out.println("wizard defend using magical mixtures");
    }

    @Override
    public void magical() {
        System.out.println("from magical interface");
    }
}
