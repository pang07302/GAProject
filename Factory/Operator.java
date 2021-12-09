package Factory;

import Mutator.*;
import Reproducer.*;
import Selector.*;

public abstract class Operator {

    abstract public Selection getSelector();

    abstract public Crossover getReproducer();

    abstract public Mutation getMutator();

}
