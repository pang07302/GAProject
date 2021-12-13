package Human;

public class Couple {
    private Individual parentA;
    private Individual parentB;

    public Couple(Individual parentA, Individual parentB) {
        this.parentA = parentA;
        this.parentB = parentB;
    }

    public Individual getParentA() {
        return parentA;
    }

    public Individual getParentB() {
        return parentB;
    }

}