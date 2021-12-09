package Factory;

import Human.*;
import Mutator.*;
import Reproducer.*;
import Selector.*;
import java.util.ArrayList;

public class Config01 extends Operator {
    public static ArrayList<DNA> matingPool = new ArrayList<>();

    // the whole process of Config01 //make it be a class

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
