import java.util.Scanner;

import Factory.*;
import Human.Population;
import Controller.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        // generate random sample
        Population sample = Population.getPopulation();
        Scanner scanner = new Scanner(System.in);

        // GA combination 1
        System.out.println("Please enter a 5-characrter-long word in lowercase: ");
        String target = scanner.nextLine();
        System.out.println("we are trying....");
        Operator config = new Config01(); // implement config01
        controller.startProcess(config, sample, target);

        // GA combination 2
        System.out.println("Please enter another 5-characrter-long word in lowercase: ");
        target = scanner.nextLine();
        System.out.println("we are trying....");
        config = new Config01(); // implement config02
        controller.startProcess(config, sample, target);

        scanner.close();

    }
}