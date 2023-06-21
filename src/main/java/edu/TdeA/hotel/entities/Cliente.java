package edu.TdeA.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cliente_id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "direccion", nullable = false, length = 40)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cliente_check_out_id", nullable = false)
    private CheckOut checkOut;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cliente_check_in_id", nullable = false)
    private CheckIn checkIn;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Reserva> reservaList;

}
