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
            for (int i = 0; i < p.getGroup().length; i++) {
                p.getGroup()[i].calculateFitness(target);
            }

            Couple[] parents = config.getSelector().selectParent(p); // select
            for (int i = 0; i < p.getGroup().length; i++) {
                Individual child = config.getReproducer().crossOver(parents[i]); // crossover
                config.getMutator().mutate(child); // mutate

                if (child.toString().equals(target)) {
                    System.out.println("Bingo! " + child);
                    flag = false;
                    break;
                }
                p.getGroup()[i] = child;

            }

            if (generation >= 20000) {
                System.out.println("Cannot find the word in " + generation + " generation");
                flag = false;
            }
        }
    }
}
