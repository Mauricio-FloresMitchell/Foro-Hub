package com.forohub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo; // Título del tópico

    @Column(nullable = false, length = 500) // Define un límite de caracteres para el mensaje
    private String mensaje; // Contenido del tópico

    @Column(nullable = false)
    private String curso; // Curso al que pertenece el tópico (opcional)

    private LocalDateTime fechaCreacion = LocalDateTime.now(); // Fecha de creación automática

    @ManyToOne // Relación muchos a uno: varios tópicos pueden ser creados por un usuario
    private Usuario usuario;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL) // Relación uno a muchos con respuestas
    private List<Respuesta> respuestas;
}
