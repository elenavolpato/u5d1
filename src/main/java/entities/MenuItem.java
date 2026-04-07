package entities;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public abstract class MenuItem {
    String name;
    int calories;
    double price;

}
