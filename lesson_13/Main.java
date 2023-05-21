package lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        int input = 0;
        while (input != 5) {
            System.out.println("Choose action: ");
            System.out.println("1. Create order.");
            System.out.println("2. Add order to client.");
            System.out.println("3. Calculate customer.");
            System.out.println("4. Show all not calculated clients.");
            System.out.println("5. Exit.");
            System.out.println("6. Show all orders(technic point).");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter number of client: ");
                int numberOfClient = scanner.nextInt();
                System.out.println("Enter name of client: ");
                String name = scanner.next();
                List<Dish> dished = new ArrayList<>();
                service.CreateOrder(numberOfClient, name, dished);
                System.out.println("Order on name - " + name + " was successfully created!");
            } else if (input == 2) {
                System.out.println("Enter name of client: ");
                String nameOfClient = scanner.next();
                System.out.println("Enter the desired dish: ");
                String nameOfDish = scanner.next();
                System.out.println("Enter the cost of the dish: ");
                int priceOfDish = scanner.nextInt();
                service.addDish(nameOfClient, nameOfDish, priceOfDish);
                System.out.println("Dish with the name: " + nameOfDish + " ,was successfully added to " + nameOfClient + "customer order. ");
            } else if (input == 3) {
                System.out.println("Enter name of client: ");
                String nameOfClient = scanner.next();
                System.out.println("Order receipt: ");
                service.showOneBranch(nameOfClient);
                System.out.println("Amount payable: " + service.calculateClientsOrder(nameOfClient));
            } else if (input == 4) {
                System.out.println("List of not calculated clients: ");
                service.showAllNotCalculatedClients();
            } else if (input == 5) {
                break;
                //тестовый метод снизу.
            } else if (input == 6) {
                service.getMenu().forEach((key, value) -> System.out.println(key + "; " + value));
            }
        }
    }
}
