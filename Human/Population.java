package Human;

public class Population {
    final int size = 1000;
    public Individual[] population = new Individual[size];

    private static Population p = null;

    private Population() {
        for (int i = 0; i < size; i++) {
            population[i] = new Individual();
        }

    }

    public static Population getPopulation() {

        if (p == null) {
            p = new Population();
        }
        return p;
    }

}
// only generate population once, so consider using singleton pattern;
