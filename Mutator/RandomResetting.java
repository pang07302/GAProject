package Mutator;

import Human.Individual;

public class RandomResetting implements Mutation {
    public void mutate(Individual child) {
        double rate = 0.01;
        for (int i = 0; i < child.genes.length; i++) {
            double r = Math.random();
            if (r < rate) {
                child.genes[i] = (char) ((int) (Math.random() * (122 - 97 + 1)) + 97);
            }
        }
    }

}
