package practiceGame;



public abstract class player {
    String name;
    String role;
    int health;

    public player(String name, String role, int health){
        this.name=name;
        this.role=role;
        this.health=health;

    }



    public void health(){
        System.out.println("Players health is "+ health);
    }
    public abstract void attack();
    public abstract void defend();
}
