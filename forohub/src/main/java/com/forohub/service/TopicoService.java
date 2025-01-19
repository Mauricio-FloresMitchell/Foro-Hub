package com.forohub.service;

import com.forohub.model.Topico;
import com.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> listarTodos() {
        return topicoRepository.findAll(); // Devuelve todos los tópicos
    }

    public Topico crearTopico(Topico topico) {
        return topicoRepository.save(topico); // Crea un nuevo tópico
    }

    public Optional<Topico> buscarPorId(Long id) {
        return topicoRepository.findById(id); // Busca un tópico por ID
    }

    public void eliminarTopico(Long id) {
        topicoRepository.deleteById(id); // Elimina un tópico por ID
    }
}
