package lesson_13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    public Map<Client, Order> getMenu() {
        return menu;
    }

    private Map<Client, Order> menu = new HashMap();

    public Map<Client, Order> CreateOrder(int numberOfClient, String nameOfClient, List<Dish> dished) {
        Client client = new Client(numberOfClient, nameOfClient);
        Order order = new Order(dished);
        menu.put(client, order);
        return menu;
    }

    public Map<Client, Order> addDish(String nameOfClient, String nameOfDish, int priceOfDish) {
        Client client1 = new Client(nameOfClient);
        if (menu.containsKey(client1)) {
            menu.get(client1).getDished().add(new Dish(nameOfDish, priceOfDish));
            return menu;
        } else {
            System.out.println("Client was not found in the system, please try again.");
        }
        return null;
    }

    public int calculateClientsOrder(String nameOfClient) {
        Client client = new Client(nameOfClient);
        if (menu.containsKey(client)) {
            int sum = menu.get(client).getDished().stream().mapToInt(val -> val.getPriceOfDish()).sum();
            menu.remove(client);
            return sum;
        } else {
            System.out.println("Client was not found in the system, please try again. ");
        }
        return 1;
    }

    public void showOneBranch(String nameOfClient) {
        Client client = new Client(nameOfClient);
        if (menu.containsKey(client)) {
            System.out.println(menu.get(client).getDished());
        }
    }

    public void showAllNotCalculatedClients() {
        System.out.println(menu);
    }

    public void showOrderCard() {
        System.out.println(menu);
    }
}

