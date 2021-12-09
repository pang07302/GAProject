package Factory;

import Mutator.*;
import Reproducer.*;
import Selector.*;

public class Config02 extends Operator {

    public Selection getSelector() {
        return new TournamentSelection();
    }

    public Crossover getReproducer() {
        return new UniformCrossover();
    }

    public Mutation getMutator() {
        return new RandomResetting();

    }

}
