package edu.TdeA.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Articulos")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "articulo_id")
    private Long id;

    @Column(name = "articulo", nullable = false, length = 40)
    private String nombreArticulo;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "articulo_habitacion_id", nullable = false)
    private Habitacion habitacion;


}
