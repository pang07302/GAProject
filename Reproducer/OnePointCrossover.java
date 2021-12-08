package Reproducer;

import Human.Couple;
import Human.DNA;

public class OnePointCrossover implements Crossover {
    public DNA crossOver(Couple couple) {
        DNA child = new DNA();
        DNA parentA = couple.parentA;
        DNA parentB = couple.parentB;

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
