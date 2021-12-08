import java.util.Scanner;

import Factory.*;
import Human.Population;
import Reproducer.*;
import Selector.*;
import Mutator.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 5-characrter-long word in lowercase: ");
        String target = scanner.nextLine();

        System.out.println("we are trying....");
        // String target = "bank";
        Population sample = Population.getPopulation();
        // for(int i=0; i<sample.population.length; i++) {
        // System.out.println(sample.population[i].getWord());
        // }
        Operator config = new Config01();
        Selection s = config.getSelector(); // new RWSelection()
        Crossover c = config.getReproducer(); // new OnePointCrossover()
        Mutation m = config.getMutator(); // new SimpleMutation()

        config.startProcess(s, c, m, sample, target);

    }
}