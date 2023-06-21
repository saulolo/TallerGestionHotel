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
@Table(name = "Check_out")
public class CheckOut implements Serializable {

    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "check_out_id")
    private Long id;

    @Column(name = "detalle_cobro", nullable = false, length = 300)
    private String detalleCobro;

    @Column(name = "valor_factura", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorFactura;


}
