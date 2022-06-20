package com.tiendaVideoJuegos.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Credito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;
    private String cuidad;
    private String nacionalidad;


    public Credito() {
    }

    public Credito(Long idCliente, String nombre, String apellidos, String correo, String telefono, String direccion, String cuidad, String nacionalidad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuidad = cuidad;
        this.nacionalidad = nacionalidad;
    }


}
