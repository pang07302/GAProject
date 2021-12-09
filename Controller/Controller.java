package Controller;

import Human.*;
import Factory.*;

public class Controller {

    public void startProcess(Operator config, Population p, String target) {
        boolean flag = true;

        while (flag) {
            // compute the fitness of each DNA sample
            for (int i = 0; i < p.population.length; i++) {
                p.population[i].calculateFitness(target);
            }

            Couple[] parents = config.getSelector().selectParent(p);
            for (int i = 0; i < p.population.length; i++) {
                DNA child = config.getReproducer().crossOver(parents[i]); // OnePointCrossover.crossOver()
                config.getMutator().mutate(child); // SimpleMutation.mutate()

                if (child.getWord().equals(target)) {
                    System.out.println("Bingo! " + child.getWord());
                    flag = false;
                }

                p.population[i] = child;
            }
        }
    }

}
