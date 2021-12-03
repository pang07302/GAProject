import java.util.Scanner;

import Human.Population;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 5-characrter-long word: ");
        String target = scanner.nextLine();
        Population sample = Population.getPopulation(target);

    }
}
