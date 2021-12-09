package Controller;

import Selector.*;
import Reproducer.*;
import Mutator.*;
import Human.*;

public interface Controller {
    public void startProcess(Selection selection, Crossover crossover, Mutation mutation, Population p, String target);

}
