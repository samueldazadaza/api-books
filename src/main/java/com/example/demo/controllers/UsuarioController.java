package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id_libro) {
        return this.usuarioService.obtenerPorId(id_libro);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorGenero(@RequestParam("genero") String genero) {
        return this.usuarioService.obtenerPorGenero(genero);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id_libro) {
        boolean ok = this.usuarioService.eliminarUsuario(id_libro);
        if (ok) {
            return "Se eliminó el libro con id " + id_libro;
        } else {
            return "No pudo eliminar el libro con id" + id_libro;
        }
    }

}