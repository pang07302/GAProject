package Selector;

import Human.Couple;
import Human.DNA;
import Human.Population;
import java.util.*;

/*randomly select n individuals, and then select the best out of 
these to become parentA, the same process is repeated for selecting parentB  */
public class TournamentSelection implements Selection {

    public Couple[] selectParent(Population p) {
        Couple[] couples = new Couple[p.population.length];

        for (int i = 0; i < p.population.length; i++) {
            DNA parentA = null;
            DNA parentB = null;
            for (int j = 0; j < 2; j++) {
                double max = 0;
                int parentIndex = 0;
                int n = 10;
                for (int k = 0; k < n; k++) {
                    int index = new Random().nextInt(p.population.length);
                    if (p.population[index].fitness > max) {
                        max = p.population[index].fitness;
                        parentIndex = index;
                    }
                }

                // allocate to parentA -> allocate to parentB -> allocate to parentA -> allocate
                // to parentB
                // (i remember there has an english word to explain)
                if (j == 1) {
                    parentA = p.population[parentIndex];
                } else {
                    parentB = p.population[parentIndex];

                }
            }

            couples[i] = new Couple(parentA, parentB);

        }

        return couples;

    }

}
