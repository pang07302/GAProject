package Factory;

import Mutator.*;
import Reproducer.*;
import Selector.*;

public class Config01 extends Operator {

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
