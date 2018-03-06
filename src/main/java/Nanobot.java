public class Nanobot extends Combatant{

    public Nanobot(String name, int strength, int attackPower) {
        super(name, strength, attackPower);
    }

    public void disperseMedicine(Person person) {
        person.increaseHealth(getStrength());
    }
}
