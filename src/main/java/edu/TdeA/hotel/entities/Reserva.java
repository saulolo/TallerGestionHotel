package edu.TdeA.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reservas")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reserva_id")
    private Long id;

    @Column(name = "fecha_reserva")
    private LocalDate fechaReserva;

    @Column(name = "hora_reserva")
    private LocalTime horaReserva;

    @Column(name = "empleado", nullable = false, length = 50)
    private String nombreEmpleado;

    @Column(name = "cliente_codigo", nullable = false)
    private int clienteCodigo;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "reserva_empelado_id", nullable = false)
    private Empleado empleado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "reserva_cliente_id", nullable = false)
    private Cliente cliente;

}



