public class Germ extends Combatant {

    public Germ(String name, int strength, int attackPower) {
        super(name, strength, attackPower);
    }


    public void multiply(int factor) {
        int scaledStrength = getStrength() * factor;
        setStrength(scaledStrength);
    }
}
