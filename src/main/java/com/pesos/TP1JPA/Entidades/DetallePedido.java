package com.pesos.TP1JPA.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "DetallePedido")
@Data
@NoArgsConstructor
public class DetallePedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Subtotal")
    private double subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk.pedido")
    private Pedido pedido;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk.producto")
    private Producto producto;


    public DetallePedido(Long id, int cantidad, double subtotal, Pedido pedido, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.pedido = pedido;
        this.producto = producto;
    }
}
