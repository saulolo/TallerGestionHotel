package edu.TdeA.hotel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpleadoController {


    @GetMapping("/hola")
    public String GetSaludar() {
        return "Hola mundo...Saldremos vivos de esta...";
    };

}
