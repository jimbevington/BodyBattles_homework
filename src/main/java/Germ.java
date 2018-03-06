public class Germ {

    private String name;
    private int deadliness;

    public Germ(String name, int deadliness) {
        this.name = name;
        this.deadliness = deadliness;
    }

    public int getDeadliness() {
        return deadliness;
    }

    public void multiply(int factor) {
        this.deadliness *= 3;
    }
}
