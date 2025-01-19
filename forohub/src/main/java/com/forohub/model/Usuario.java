package com.forohub.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Marca esta clase como una entidad JPA
@Data   // Genera automáticamente getters, setters, equals, hashCode, toString (de Lombok)
public class Usuario {

    @Id // Define el campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente valores únicos
    private Long id;

    @Column(nullable = false, unique = true) // Restringe duplicados en "email"
    private String email;

    @Column(nullable = false) // Requiere que "password" no sea nulo
    private String password;

    private String role; // Rol del usuario (opcional: "USER", "ADMIN", etc.)
}
