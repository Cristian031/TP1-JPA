package com.pesos.TP1JPA.Entidades;

import com.pesos.TP1JPA.Enumeraciones.EstadoPedido;
import com.pesos.TP1JPA.Enumeraciones.TipoEnvio;

import jakarta.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name = "Pedido")
@NoArgsConstructor
public class Pedido implements Serializable {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "estado")
        @Enumerated(EnumType.STRING)
        private EstadoPedido estado;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "fecha")
        private Date fecha;

        @Column(name = "tipo_envio")
        @Enumerated(EnumType.STRING)
        private TipoEnvio tipoEnvio;
        private double total;

        @OneToOne(cascade = CascadeType.ALL)  //cualquier cambio que realice en PEDIDO se refleja en Factura.
        @JoinColumn(name = "fk_domicilio")
        private Factura factura;

        @ManyToOne(cascade = CascadeType.PERSIST)
        @JoinColumn(name = "fk.cliente")
        private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Pedido(Long id, EstadoPedido estado, Date fecha, TipoEnvio tipoEnvio, double total, Factura factura, Cliente cliente) {
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
        this.tipoEnvio = tipoEnvio;
        this.total = total;
        this.factura = factura;
        this.cliente = cliente;
    }
}
