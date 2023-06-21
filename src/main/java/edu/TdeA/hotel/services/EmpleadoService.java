package edu.TdeA.hotel.services;

import edu.TdeA.hotel.entities.Empleado;
import edu.TdeA.hotel.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getAllEmpleados() {
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }

    public Empleado getEmpleadoById(Long id) {
        return empleadoRepository.findById(id).get();
    }

    public boolean saveOrUpdateEmpleado(Empleado empleado) {
        Empleado emp = empleadoRepository.save(empleado);
        if (empleadoRepository.findById(emp.getId())!=null) {
            return true;
        }
        return false;
    }

    public boolean deleteEmpleado(Long id) {
        empleadoRepository.deleteById(id);
        if (getEmpleadoById(id)!=null) {
            return false;
        }
        return true;
    }

}

