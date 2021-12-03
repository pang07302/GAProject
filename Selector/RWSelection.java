package Selector;

import java.util.ArrayList;

import Factory.Config01;
import Human.DNA;
import Human.Population;

public class RWSelection extends Config01 implements Selection {
    ArrayList<DNA> matingPool = new ArrayList<DNA>();

    public void selection() { // product

    }

    public void select(Population p) { // method
        DNA[] population = p.population;
        for (int i = 0; i < population.length; i++) {
            int n = (int) (population[i].fitness * 100);
            for (int k = 0; k < n; k++) {
                matingPool.add(population[i]);
            }
        }
    }

}
