package org.example.entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "detalle_factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Audited
public class DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private int subtotal;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_factura")
    private Factura factura;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;


}