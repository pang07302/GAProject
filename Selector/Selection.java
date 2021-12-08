package Selector;

import java.util.ArrayList;

import Human.Couple;
import Human.DNA;

abstract public class Selection {

    abstract public Couple selectParent(ArrayList<DNA> matingPool);
}
