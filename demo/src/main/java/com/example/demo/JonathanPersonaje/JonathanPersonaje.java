package com.example.demo.JonathanPersonaje;

import java.sql.Date;

import com.example.demo.JonathanRol.JonathanRol;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class JonathanPersonaje {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String nombre;
    private Date fecha_nacimiento;
    private Boolean hombre_mujer;

    @ManyToOne
    private JonathanRol jonathanRol;
}
