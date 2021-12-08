package Selector;

import java.util.ArrayList;

import Human.Couple;
import Human.DNA;

public class RWSelection extends Selection {

    public Couple selectParent(ArrayList<DNA> matingPool) {

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
