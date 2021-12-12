package Selector;

import java.util.ArrayList;

import Human.Couple;
import Human.Individual;
import Human.Population;

public class RWSelection implements Selection {
    public ArrayList<Individual> wheel = new ArrayList<>(); // the wheel

    public Couple[] selectParent(Population p) {
        Couple[] couples = new Couple[p.getGroup().length];

        for (int i = 0; i < p.getGroup().length; i++) {
            int n = (int) (p.getGroup()[i].getFitness() * 20);
            for (int k = 0; k < n; k++) {
                wheel.add(p.getGroup()[i]);
            }
        }
        for (int i = 0; i < p.getGroup().length; i++) {
            int a = (int) (Math.random() * wheel.size());
            int b = (int) (Math.random() * wheel.size());
            // get rid of parent with same DNA (can be improved)
            while (a == b) {
                b = (int) (Math.random() * wheel.size());
            }
            Individual parentA = wheel.get(a);
            Individual parentB = wheel.get(b);

            couples[i] = new Couple(parentA, parentB);
        }

        return couples;

    }

}
