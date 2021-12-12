package Controller;

import Human.*;
import Factory.*;

public class Controller {

    public void startProcess(Operator config, String target) {
        // generate random sample
        Population p = Population.getPopulation();

        boolean flag = true;
        int generation = 1;

        while (flag) {
            generation++;
            // compute the fitness of each DNA sample
            for (int i = 0; i < p.population.length; i++) {
                p.population[i].calculateFitness(target);
            }

            Couple[] parents = config.getSelector().selectParent(p);
            for (int i = 0; i < p.population.length; i++) {
                Individual child = config.getReproducer().crossOver(parents[i]); // OnePointCrossover.crossOver()
                config.getMutator().mutate(child); // SimpleMutation.mutate()

                if (child.getWord().equals(target)) {
                    System.out.println("Bingo! " + child.getWord());
                    flag = false;
                    break;
                }

                p.population[i] = child;

            }

            if (generation >= 20000) {
                System.out.println("Cannot find the word in " + generation + " generation");
                flag = false;
            }
        }
    }
}
