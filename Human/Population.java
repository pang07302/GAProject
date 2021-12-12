package Human;

public class Population {
    final int size = 1000;
    private Individual[] group = new Individual[size];

    private static Population p = null;

    private Population() {
        for (int i = 0; i < size; i++) {
            group[i] = new Individual();
        }

    }

    public static Population getPopulation() {

        if (p == null) {
            p = new Population();
        }
        return p;
    }

    public Individual[] getGroup() {
        return group;
    }

}
// only generate population once, so consider using singleton pattern;
