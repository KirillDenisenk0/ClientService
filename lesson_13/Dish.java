package lesson_13;

import java.util.Objects;

public class Dish {
    private String nameOfDish;
    private int priceOfDish;

    @Override
    public String toString() {
        return nameOfDish + ": " + priceOfDish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return priceOfDish == dish.priceOfDish && Objects.equals(nameOfDish, dish.nameOfDish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDish, priceOfDish);
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public int getPriceOfDish() {
        return priceOfDish;
    }

    public Dish(String name, int price) {
        this.nameOfDish = name;
        this.priceOfDish = price;
    }
}
