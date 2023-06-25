package edu.TdeA.hotel.controllers;

import edu.TdeA.hotel.entities.Empleado;
import edu.TdeA.hotel.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EjemploEmpleadoController {

    /*Este es un ejemplo de como se mapea un servicio con Controller*/

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping({"/","/VerEmpleados"})
    public String viewEmpleados(Model model) {
        List<Empleado> empleadoList = empleadoService.getAllEmpleados();
        model.addAttribute("emplist", empleadoList);
        return "VerEmpleados";
    }



    //terminar los métodos de guardar, editar y eliminar empleados aqui en el controlador


}
