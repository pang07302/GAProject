package Factory;

import Reproducer.*;
import Selector.*;
import Mutator.*;

public class Config01 extends Operator {
    Selection getSelector() {
        return new RWSelection();

    }

    Crossover getReproducer() {
        return new OnePointCrossover();

    }

    Mutation getMutator() {
        return new SimpleMutation();

    }

}
