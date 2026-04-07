package config;

import entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {
    @Bean
    public Topping tomato() {
        return new Topping("Tomato", 0, 0.0);
    }
    @Bean(name = "cheese")
    public Topping cheeseTopping() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "ham")
    public Topping hamTopping() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "onions")
    public Topping onionsTopping() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean(name = "pineapple")
    public Topping pineappleTopping() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "salami")
    public Topping salamiTopping() {
        return new Topping("Salami", 86, 0.99);
    }
}
