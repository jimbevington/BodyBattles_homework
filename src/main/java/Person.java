import java.util.ArrayList;

public class Person {


    private String name;
    private int health;
    private final ArrayList<Combatant> body;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
        this.body = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }
}
