import java.util.Scanner;

import Factory.*;
import Controller.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        Scanner scanner = new Scanner(System.in);

        // GA combination 1
        System.out.println("Please enter a 6-characrter-long word in lowercase: ");
        String target = scanner.nextLine().toLowerCase();
        System.out.println("we are trying....");
        Operator config = new Config01(); // implement config02
        controller.startProcess(config, target);

        // GA combination 2
        System.out.println("Please enter another 6-characrter-long word in lowercase: ");
        target = scanner.nextLine().toLowerCase();
        System.out.println("we are trying....");
        config = new Config02(); // implement config02
        controller.startProcess(config, target);

        scanner.close();

    }
}