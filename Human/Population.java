package Human;

import java.util.ArrayList;

public class Population {
    public final int size = 1000;
    public DNA[] population = new DNA[size];
    private static Population p = null;

    private Population(String target) {
        for (int i = 0; i < population.length; i++) {
            population[i] = new DNA();
            population[i].calculateFitness(target); // compute the fitness of each DNA sample
        }

    }

    public static Population getPopulation(String target) {

        if (p == null) {
            p = new Population(target);
        }
        return p;
    }

}
// only generate population once, so consider using singleton pattern;
