package com.pesos.TP1JPA.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Domicilio")
@Data
@NoArgsConstructor
public class Domicilio implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Calle")
    private String calle;
    @Column(name = "Numero")
    private String numero;
    @Column(name = "Localidad")
    private String localidad;

    @ManyToOne(cascade = CascadeType.PERSIST) //Se usa persist ya que solo queremos persistir un cliente, si se modifica el dom no se debe modificar el cliente
    @JoinColumn(name = "fk.cliente")
    private Cliente cliente;

    public Domicilio(Long id, String calle, String numero, String localidad, Cliente cliente) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.cliente = cliente;
    }
}
