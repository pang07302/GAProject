package Factory;

import Human.*;
import Mutator.*;
import Reproducer.*;
import Selector.*;

public abstract class Operator {

    abstract public void startProcess(Selection selection, Crossover crossover, Mutation mutation, Population p,
            String target);

    abstract public Selection getSelector();

    abstract public Crossover getReproducer();

    abstract public Mutation getMutator();

}
