package Selector;

import Human.Couple;
import Human.Population;

public interface Selection {

    abstract public Couple[] selectParent(Population p);
}
