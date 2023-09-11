package com.pesos.TP1JPA.Entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Rubro")
@Data
@NoArgsConstructor
public class Rubro implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "Denominacion")
    private String denominacion;

    public Rubro(String denominacion) {
        this.denominacion = denominacion;
    }
}
