package entities;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString

public abstract class MenuItem {
    String name;
    int calories;
    double price;

}
