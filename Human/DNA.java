package Human;

/* Using generic in DNA so that we just need to make the class and method once and use it for any type we want.
*/
public class DNA<T> {
    private T gene;

    public DNA(T gene) {
        this.gene = gene;
    }

    public T getGene() {
        return gene;
    }
}
