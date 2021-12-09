package Selector;

import java.util.ArrayList;

import Human.Couple;
import Human.DNA;
import Human.Population;

public interface Selection {

    abstract public Couple[] selectParent(Population p);
}
