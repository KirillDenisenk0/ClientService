package lesson_13;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> dished = new ArrayList<>();


    public List<Dish> getDished() {
        return dished;
    }

    @Override
    public String toString() {
        return "{" +
                "dished=" + dished +
                '}';
    }

    public Order(List<Dish> dished) {
        this.dished = dished;
    }

}
