package com.pesos.TP1JPA.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//@Entity  //Con esta etiqueta indico a la unidad de persistencia que esta entidad se debe guardar en la bd
//@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cliente implements Serializable {

  //  @Column(name = "nombre") //Sirve para indentificar un name en la columna de la tabla, sino toma por defecto el del atributo
    private String nombre;
    private String apellido;
    private String telefono;

   // @Column(name = "email", unique = true)  //Esto sirve para que no hayan 2 registros con el mismo email
    private String email;

}
