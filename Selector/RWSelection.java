package Selector;

import java.util.ArrayList;

import Human.Couple;
import Human.DNA;
import Factory.Config01;

public class RWSelection implements Selection {
    public ArrayList<DNA> matingPool = Config01.matingPool;

    public Couple selectParent() {

        int a = (int) (Math.random() * matingPool.size());
        int b = (int) (Math.random() * matingPool.size());
        // get rid of parent with same DNA (can be improved)
        while (a == b) {
            b = (int) (Math.random() * matingPool.size());
        }
        DNA parentA = matingPool.get(a);
        DNA parentB = matingPool.get(b);

        return new Couple(parentA, parentB);

    }

}
