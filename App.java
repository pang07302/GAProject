import java.util.Scanner;

import Factory.*;
import Human.Population;
import Reproducer.*;
import Selector.*;
import Mutator.*;
import Controller.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 5-characrter-long word in lowercase: ");
        String target = scanner.nextLine();
        System.out.println("we are trying....");

        // generate random sample
        Population sample = Population.getPopulation();

        Operator config = new Config01(); // implement different config
        Selection s = config.getSelector(); // new RWSelection() or new RandomSelection
        Crossover c = config.getReproducer(); // new OnePointCrossover() or new TwoPointCrossover()
        Mutation m = config.getMutator(); // new RandomResetting() or new SwapMutation

        Controller controller = new Controller();
        controller.startProcess(s, c, m, sample, target);
        scanner.close();

    }
}