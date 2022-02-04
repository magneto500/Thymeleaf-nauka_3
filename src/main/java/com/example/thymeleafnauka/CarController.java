package com.example.thymeleafnauka;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CarController {
				@GetMapping("/car")

				public String get(Model model){
								model.addAttribute("name", "Tomek");
        Car car = new Car("BMW", "i8");
        model.addAttribute("Car", car);
								return "car";
				}
}
