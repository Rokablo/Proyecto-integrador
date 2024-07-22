package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private Map<Long, Usuario> usuarios = new HashMap<>();
    private long currentId = 1;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        usuario.setId(currentId++);
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long id) {
        return Optional.ofNullable(usuarios.get(id));
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuario) {
        if (usuarios.containsKey(id)) {
            usuario.setId(id);
            usuarios.put(id, usuario);
            return usuario;
        }
        return null;
    }

    @Override
    public boolean deleteUsuario(Long id) {
        return usuarios.remove(id) != null;
    }
}
