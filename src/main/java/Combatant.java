public abstract class Combatant {

    private String name;
    private int strength;

    public Combatant(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int value){
        this.strength = value;
    }

    public void attack(Combatant combatant){
        int newStrength = combatant.getStrength() - strength;
        combatant.setStrength(newStrength);
    }
}
