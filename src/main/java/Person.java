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

    public int bodyCount() {
        return this.body.size();
    }

    public void catchDisease(Germ germ) {
        this.body.add(germ);
    }

    public ArrayList<Combatant> getBody() {
        return body;
    }
}
