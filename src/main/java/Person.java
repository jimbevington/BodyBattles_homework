import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class Person {


    private String name;
    private int health;
    private final ArrayList<Combatant> body;
    private final ArrayList<String> immunities;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
        this.body = new ArrayList<>();
        this.immunities = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public int bodyCount() {
        return this.body.size();
    }

    public void catchDisease(Germ germ) {
//        add a germ to the body
        this.body.add(germ);
//        dock health by the germs strength
        this.health -= germ.getStrength();
    }

    public ArrayList<Combatant> getBody() {
        return body;
    }

    public void eatNanobot(Nanobot bot) {
        this.body.add(bot);
    }

    public void increaseHealth(int amount) {
        this.health += amount;
    }

    public ArrayList<String> getImmunities() {
        return immunities;
    }

    public void becomeImmune(String germName) {
        immunities.add(germName);
    }
}
