public abstract class Combatant {

    private int attackPower;
    private String name;
    private int strength;

    public Combatant(String name, int strength, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.attackPower = attackPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int value){
        this.strength = value;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack(Combatant combatant){
        int newStrength = combatant.getStrength() - attackPower;
        combatant.setStrength(newStrength);
    }
}
