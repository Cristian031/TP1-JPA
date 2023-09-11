package com.pesos.TP1JPA.Entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Rubro")
@Data
@NoArgsConstructor
public class Rubro implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "Denominacion")
    private String denominacion;

    @OneToMany(mappedBy = "rubro")
    private List<Producto> productos = new ArrayList<Producto>();

    public Rubro(String denominacion, List<Producto> productos) {
        this.denominacion = denominacion;
        this.productos = productos;
    }


}
