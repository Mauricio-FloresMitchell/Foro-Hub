package com.forohub.repository;

import com.forohub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
List<Topico> findByTituloContainingIgnoreCase(String titulo);
