package edu.TdeA.hotel;

import edu.TdeA.hotel.entities.Habitacion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class HotelApplication {

	@GetMapping("/hello")
	public String GetSaludar() {
		return "Hola mundo...Saldremos vivos de esta...";
	};

	@GetMapping("/test")
	public String test() {
		Habitacion habitacion = new Habitacion();
		habitacion.setTipoHabitacion("Lujosa");
		return habitacion.getTipoHabitacion();
	};

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);



	}
}
