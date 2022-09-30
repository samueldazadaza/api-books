package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id_libro) {
        return usuarioRepository.findById(id_libro);
    }

    public ArrayList<UsuarioModel> obtenerPorGenero(String genero) {
        return usuarioRepository.findByGenero(genero);
    }

    public boolean eliminarUsuario(Long id_libro) {
        try {
            usuarioRepository.delete(id_libro);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}