package practiceGame;

public class thief extends player implements stealInterface{
    String stealSomething;

    public thief(String name, String role, int health, String stealSomething){
        super( name, role, health);
        this.stealSomething=stealSomething;


    }

    @Override
    public void attack() {
        System.out.println(name+ "attack by stolen things ");
    }

    @Override
    public void defend() {
        System.out.println(name+ "attack defend by stolen things" );
    }
}
