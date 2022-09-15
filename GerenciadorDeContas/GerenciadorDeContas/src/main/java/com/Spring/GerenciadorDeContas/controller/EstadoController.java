package com.Spring.GerenciadorDeContas.controller;

import com.Spring.GerenciadorDeContas.Model.EstadoModel;
import com.Spring.GerenciadorDeContas.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @GetMapping(path= "/estado")
    public List<EstadoModel> mostrarTodosEstados(){
        return estadoService.mostrarTodosEstados();
    }

    @GetMapping(path="/estado/{estado_id}" )
    public Optional<EstadoModel> buscarPorId(@PathVariable Long estado_id){
        return estadoService.buscarPorId(estado_id);
    }

    @PostMapping(path = "/estado/{codigo}")
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoModel cadastrar(@RequestBody EstadoModel estadoModel){
        return estadoService.cadastrar(estadoModel);
    }

    @PutMapping(path = "/estado/{estado_id}")
    public EstadoModel alterar(@RequestBody EstadoModel estadoModel){
        return estadoService.alterar(estadoModel);

    }

    @DeleteMapping(path = "/estado/{estado_id}")
    public void deletar(@PathVariable Long estado_id){
        estadoService.deletar(estado_id);
    }
}
