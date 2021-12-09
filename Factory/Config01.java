package Factory;

import Human.*;
import Mutator.*;
import Reproducer.*;
import Selector.*;
import java.util.ArrayList;

public class Config01 extends Operator {
    public static ArrayList<DNA> matingPool = new ArrayList<>();

    // the whole process of Config01 //make it be a class
    public void startProcess(Selection selection, Crossover crossover, Mutation mutation, Population p, String target) {
        boolean flag = true;
        while (flag) {

            // compute the fitness of each DNA sample
            for (int i = 0; i < p.population.length; i++) {
                p.population[i].calculateFitness(target);
            }

            for (int i = 0; i < p.population.length; i++) {
                int n = (int) (p.population[i].fitness * 20);
                for (int k = 0; k < n; k++) {
                    matingPool.add(p.population[i]);
                }
            }

            for (int i = 0; i < p.population.length; i++) {
                Couple parents = selection.selectParent(); // RWSelection.selectParent()
                DNA child = crossover.crossOver(parents); // OnePointCrossover.crossOver()
                mutation.mutate(child); // SimpleMutation.mutate()

                if (child.getWord().equals(target)) {
                    System.out.println("Bingo! " + child.getWord());
                    flag = false;
                    System.out.println(matingPool.size());
                }

                p.population[i] = child;
            }
        }
    }

    public Selection getSelector() {
        return new RWSelection();
    }

    public Crossover getReproducer() {
        return new OnePointCrossover();
    }

    public Mutation getMutator() {
        return new RandomResetting();

    }

}
