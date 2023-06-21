package edu.TdeA.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Check_in")
public class CheckIn implements Serializable {

    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "check_in_id")
    private Long id;

    @Column(name = "ciudad_origen", nullable = false, length = 40)
    private String ciudadOrigen;

    @Column(name = "dias_hospedaje", nullable = false)
    private int diasHospedaje;

    @Column(name = "cantidad_adultos", nullable = false)
    private int cantidadAdultos;

    @Column(name = "cantidad_menores", nullable = false)
    private int cantidadMenores;

    @Column(name = "motivo", nullable = false, length = 40)
    private String motivo;

    @JoinColumn(name = "equipaje", nullable = false)
    private Boolean equipaje;


}
