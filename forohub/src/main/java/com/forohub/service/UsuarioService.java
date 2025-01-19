package com.forohub.service;

import com.forohub.model.Usuario;
import com.forohub.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario); // Registra un usuario en la base de datos
    }

    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email); // Busca un usuario por email
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id); // Busca un usuario por ID
    }
}
