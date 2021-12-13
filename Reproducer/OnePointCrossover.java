package Reproducer;

import Human.Couple;
import Human.Individual;

public class OnePointCrossover implements Crossover {
    public Individual crossOver(Couple couple) {
        Individual child = new Individual();
        Individual parentA = couple.getParentA();
        Individual parentB = couple.getParentB();

        int midPoint = (int) Math.random() * parentA.getGenes().length;
        for (int i = 0; i < parentB.getGenes().length; i++) {
            if (i < midPoint) {
                child.getGenes()[i] = parentB.getGenes()[i];
            } else {
                child.getGenes()[i] = parentA.getGenes()[i];
            }

        }
        return child;
    }
}
