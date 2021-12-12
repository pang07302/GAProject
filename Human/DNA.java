package Human;

// generic
public class DNA<T> {
    private T gene;

    public DNA(T gene) {
        this.gene = gene;
    }

    public T getGene() {
        return gene;
    }
}
