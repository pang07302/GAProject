package Reproducer;

import Human.Couple;
import Human.DNA;

public class OnePointCrossover implements Crossover {

    public DNA crossover(Couple parents) {
        DNA child = new DNA();
        int crossPoint = (int) (Math.random() * (parents.parentA.genes.length));
        for (int i = 0; i < parents.parentA.genes.length; i++) {
            if (i < crossPoint) {
                child.genes[i] = parents.parentA.genes[i];
            } else {
                child.genes[i] = parents.parentB.genes[i];
            }
        }
        return child;
    }
}