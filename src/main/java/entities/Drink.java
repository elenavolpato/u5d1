package entities;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Drink extends MenuItem {
    String volume;

    public Drink(String name, int calories, double price, String volume) {
        super(name, calories, price);
        this.volume = volume;
    }
}
