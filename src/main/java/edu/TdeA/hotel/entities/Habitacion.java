package edu.TdeA.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Habitaciones")
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "habitacion_id")
    private Long id;

    @Column(name = "tipo_habitacion", nullable = false, length = 40)
    private String tipoHabitacion;

    @Column(name = "costo", nullable = false, precision = 10, scale = 2)
    private BigDecimal costo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "habitacion", cascade = CascadeType.ALL)
    private List<ClienteHabitacion> clienteHabitacionList;


}
