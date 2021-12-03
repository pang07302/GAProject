package Factory;

import Reproducer.Crossover;
import Selector.Selection;
import Mutator.Mutation;

public abstract class Operator {

    void startProcess(Selection selection, Crossover crossover, Mutation mutation) {

    }

    abstract Selection getSelector();

    abstract Crossover getReproducer();

    abstract Mutation getMutator();

}