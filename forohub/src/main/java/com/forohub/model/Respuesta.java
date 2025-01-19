package com.forohub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mensaje; // Contenido de la respuesta

    @ManyToOne // Relación muchos a uno: una respuesta pertenece a un usuario
    private Usuario usuario;

    @ManyToOne // Relación muchos a uno: una respuesta pertenece a un tópico
    private Topico topico;

    private LocalDateTime fechaCreacion = LocalDateTime.now(); // Fecha de creación automática
}
