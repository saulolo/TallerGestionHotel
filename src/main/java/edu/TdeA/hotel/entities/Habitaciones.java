package edu.TdeA.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Habitacion")
public class Habitaciones {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //private Articulos articulos;
    private String tipoHabitacion;
    private Double costo;
    //private List<Articulos> articulosList;









}
