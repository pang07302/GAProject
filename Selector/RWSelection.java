package Selector;

import java.util.ArrayList;

import Human.Couple;
import Human.DNA;
import Human.Population;

public class RWSelection implements Selection {
    public ArrayList<DNA> wheel = new ArrayList<>(); // the wheel

    public Couple[] selectParent(Population p) {
        Couple[] couples = new Couple[p.population.length];

        for (int i = 0; i < p.population.length; i++) {
            int n = (int) (p.population[i].fitness * 20);
            for (int k = 0; k < n; k++) {
                wheel.add(p.population[i]);
            }
        }
        for (int i = 0; i < p.population.length; i++) {
            int a = (int) (Math.random() * wheel.size());
            int b = (int) (Math.random() * wheel.size());
            // get rid of parent with same DNA (can be improved)
            while (a == b) {
                b = (int) (Math.random() * wheel.size());
            }
            DNA parentA = wheel.get(a);
            DNA parentB = wheel.get(b);

            couples[i] = new Couple(parentA, parentB);
        }

        return couples;

    }

}
