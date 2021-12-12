package Reproducer;

import Human.Couple;
import Human.Individual;

public class OnePointCrossover implements Crossover {
    public Individual crossOver(Couple couple) {
        Individual child = new Individual();
        Individual parentA = couple.parentA;
        Individual parentB = couple.parentB;

        int midPoint = (int) Math.random() * parentA.genes.length;
        for (int i = 0; i < parentB.genes.length; i++) {
            if (i < midPoint) {
                child.genes[i] = parentB.genes[i];
            } else {
                child.genes[i] = parentA.genes[i];
            }

        }
        return child;
    }
}
