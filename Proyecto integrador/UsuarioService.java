package com.example.demo.service;

import com.example.demo.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario createUsuario(Usuario usuario);
    Optional<Usuario> getUsuarioById(Long id);
    List<Usuario> getAllUsuarios();
    Usuario updateUsuario(Long id, Usuario usuario);
    boolean deleteUsuario(Long id);
}
