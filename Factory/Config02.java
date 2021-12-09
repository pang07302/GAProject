package Factory;

import Human.*;
import Mutator.*;
import Reproducer.*;
import Selector.*;
import java.util.ArrayList;

public class Config02 extends Operator {
    public ArrayList<DNA> matingPool = new ArrayList<>();

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
