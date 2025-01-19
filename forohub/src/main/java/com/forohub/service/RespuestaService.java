package com.forohub.service;

import com.forohub.model.Respuesta;
import com.forohub.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {

    @Autowired
    private RespuestaRepository respuestaRepository;

    public Respuesta agregarRespuesta(Respuesta respuesta) {
        return respuestaRepository.save(respuesta); // Agrega una nueva respuesta
    }

    public List<Respuesta> listarPorTopicoId(Long topicoId) {
        return respuestaRepository.findByTopicoId(topicoId); // Respuestas de un tópico
    }
}
