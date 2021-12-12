package Reproducer;

import Human.Couple;

import Human.Individual;

public class UniformCrossover implements Crossover {
    public Individual crossOver(Couple couple) {
        Individual child = new Individual();
        Individual parentA = couple.parentA;
        Individual parentB = couple.parentB;

        // Doing Uniform crossover
        for (int i = 0; i < parentA.getGenes().length; i++) {
            // Flipping a coin, if we get value less than 0.5 we swap values in parentA with
            // ParentB
            if (Math.random() < 0.5) {
                child.getGenes()[i] = parentB.getGenes()[i];
            } else {
                child.getGenes()[i] = parentA.getGenes()[i];
            }
        }

        return child;
    }

}
