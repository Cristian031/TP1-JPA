package com.pesos.TP1JPA.Entidades;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity  //Con esta etiqueta indico a la unidad de persistencia que esta entidad se debe guardar en la bd
@Table(name = "Cliente")
@Data

public class Cliente implements Serializable {

  //  @Column(name = "nombre") //Sirve para indentificar un name en la columna de la tabla, sino toma por defecto el del atributo

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Esto representa la clave principal
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Telefono")
    private String telefono;
   // @Column(name = "email", unique = true)  //Esto sirve para que no hayan 2 registros con el mismo email
   @Column(name = "Email")
    private String email;

   @OneToMany(mappedBy = "cliente")
   private List<Domicilio> domicilios = new ArrayList<Domicilio>();

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<Pedido>();


    public Cliente(){
    }

    public Cliente(Long id, String nombre, String apellido, String telefono, String email, List<Domicilio> domicilios, List<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.domicilios = domicilios;
        this.pedidos = pedidos;
    }
}
