public class Germ extends Combatant {

    private String name;

    public Germ(String name, int strength, int attackPower) {
        super(strength, attackPower);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void multiply(int factor) {
        int scaledStrength = getStrength() * factor;
        setStrength(scaledStrength);
    }
}
