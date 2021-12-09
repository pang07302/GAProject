package Reproducer;

import Human.Couple;
import Human.DNA;

public class UniformCrossover implements Crossover {
    public DNA crossOver(Couple couple) {
        DNA child = new DNA();
        DNA parentA = couple.parentA;
        DNA parentB = couple.parentB;

        // Doing Uniform crossover
        for (int i = 0; i < parentA.genes.length; i++) {
            // Flipping a coin, if we get value less than 0.5 we swap values in parentA with
            // ParentB
            if (Math.random() < 0.5) {
                child.genes[i] = parentB.genes[i];
            } else {
                child.genes[i] = parentA.genes[i];
            }
        }

        return child;
    }

}
