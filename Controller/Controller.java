package Controller;

import Selector.*;
import Reproducer.*;
import Mutator.*;
import Human.*;

public class Controller {
    public void startProcess(Selection selection, Crossover crossover, Mutation mutation, Population p, String target) {
        boolean flag = true;

        while (flag) {
            // compute the fitness of each DNA sample
            for (int i = 0; i < p.population.length; i++) {
                p.population[i].calculateFitness(target);
            }

            Couple[] parents = selection.selectParent(p);
            for (int i = 0; i < p.population.length; i++) {
                DNA child = crossover.crossOver(parents[i]); // OnePointCrossover.crossOver()
                mutation.mutate(child); // SimpleMutation.mutate()

                if (child.getWord().equals(target)) {
                    System.out.println("Bingo! " + child.getWord());
                    flag = false;
                }

                p.population[i] = child;
            }
        }
    }

}
