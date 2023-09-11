package com.pesos.TP1JPA.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Factura")
@NoArgsConstructor
public class Factura implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Numero")
    private int numero;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha")
    private Date fecha;
    @Column(name = "Descuento")
    private double descuento;
    @Column(name = "Total")
    private int total;

    public Factura(int numero, Date fecha, double descuento, int total) {
        this.numero = numero;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
    }
}
