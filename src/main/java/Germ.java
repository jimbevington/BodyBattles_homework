public class Germ {

    private final String name;
    private final int deadliness;

    public Germ(String name, int deadliness) {
        this.name = name;
        this.deadliness = deadliness;
    }

    public int getDeadliness() {
        return deadliness;
    }
}
