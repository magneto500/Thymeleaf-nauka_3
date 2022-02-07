package com.example.thymeleafnauka;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Arrays;
import java.util.List;


@Controller
public class CarController {
				@GetMapping("/car")

				public String get(Model model) {
								model.addAttribute("name", "Tomek");
								Car car = new Car("BMW", "i8");
								Car car1 = new Car("Opel", "Corsa OPC");
								Car car2 = new Car("Opel", "Astra");
								Car car3 = new Car("Suzuki", "SX4 S-Cross");
								model.addAttribute("Car",car);
								List<Car> cars = Arrays.asList(car,car1,car2,car3);
								model.addAttribute("cars",cars);


								return "car";
				}
}