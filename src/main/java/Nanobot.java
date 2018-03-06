public class Nanobot extends Combatant{

    public Nanobot(int strength, int attackPower) {
        super(strength, attackPower);
    }

    public void disperseMedicine(Person person) {
//        increase the host person's health by the nanobot strength
        person.increaseHealth(getStrength());
    }
}
