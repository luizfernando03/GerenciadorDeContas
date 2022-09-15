package com.Spring.GerenciadorDeContas.controller;

import com.Spring.GerenciadorDeContas.Model.UsuarioModel;
import com.Spring.GerenciadorDeContas.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(path ="/usuarios")
    public List<UsuarioModel> procurarTodosUsuarios(){
        return usuarioService.mostrarTodosUsuarios();
    }

    @PostMapping(path="/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel registrar(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.cadastrarUsuario(usuarioModel);
    }

    @PutMapping(path = "/usuario/{usuario_id}")
    public UsuarioModel alterar(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.alterarUsuarioModel(usuarioModel);
    }

    @DeleteMapping(path = "/usuario/{usuario_id}")
    public void deletar(@PathVariable Long usuario_id){
        usuarioService.deletar(usuario_id);
    }

}
