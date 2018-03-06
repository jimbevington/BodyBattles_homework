public abstract class Combatant {

    private final String name;
    private final int strength;

    public Combatant(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

}