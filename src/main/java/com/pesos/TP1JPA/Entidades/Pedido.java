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

    public Pedido(Long id, EstadoPedido estado, Date fecha, TipoEnvio tipoEnvio, double total) {
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
        this.tipoEnvio = tipoEnvio;
        this.total = total;
    }




}
