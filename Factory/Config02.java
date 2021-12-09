package Factory;

import Human.*;
import Mutator.*;
import Reproducer.*;
import Selector.*;
import java.util.ArrayList;

public class Config02 extends Operator {
    public ArrayList<DNA> matingPool = new ArrayList<>();

    // the whole process of Config02
    public void startProcess(Selection selection, Crossover crossover, Mutation mutation, Population p, String target) {
        boolean flag = true;
        while (flag) {

        }

    }

    public Selection getSelector() {
        return new RWSelection();
    }

    public Crossover getReproducer() {
        return new OnePointCrossover();
    }

    public Mutation getMutator() {
        return new RandomResetting();

    }

}
