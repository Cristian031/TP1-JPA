package com.pesos.TP1JPA.Entidades;

import com.pesos.TP1JPA.Enumeraciones.FormadePago;

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
    @Enumerated(EnumType.STRING)
    private FormadePago formadePago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public FormadePago getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(FormadePago formadePago) {
        this.formadePago = formadePago;
    }

    public Factura(int numero, Date fecha, double descuento, int total, FormadePago formadePago) {
        this.numero = numero;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
    }


}
