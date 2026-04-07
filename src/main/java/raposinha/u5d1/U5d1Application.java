package raposinha.u5d1;

import entities.Drink;
import entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);

		Topping tomato = ctx.getBean(Topping.class);
		tomato.setCalories(12);
		System.out.println(tomato);

	}
}
