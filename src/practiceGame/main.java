package practiceGame;

public class main {
    public static void main(String[] args) {
        archer arch1= new archer("character1", "archer", 100, 560);
        arch1.attack();
        arch1.defend();
        wizard wizard1= new wizard("character2", "wizard", 100, "magic wand");
        wizard1.attack();
        wizard1.health();
        wizard1.defend();
        wizard1.magical();
    }
}
