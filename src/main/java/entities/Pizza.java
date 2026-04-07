package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
public class Pizza extends MenuItem {
    List<Topping> toppings;

    public Pizza(String name, int calories, double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }
}
