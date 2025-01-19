package com.forohub.controller;

import com.forohub.model.Respuesta;
import com.forohub.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    @Autowired
    private RespuestaService respuestaService;

    @PostMapping
    public ResponseEntity<Respuesta> agregarRespuesta(@RequestBody Respuesta respuesta) {
        Respuesta nuevaRespuesta = respuestaService.agregarRespuesta(respuesta);
        return ResponseEntity.status(201).body(nuevaRespuesta);
    }

    @GetMapping("/topico/{topicoId}")
    public ResponseEntity<List<Respuesta>> listarRespuestasPorTopico(@PathVariable Long topicoId) {
        List<Respuesta> respuestas = respuestaService.listarPorTopicoId(topicoId);
        return ResponseEntity.ok(respuestas);
    }
}
