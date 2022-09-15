package com.Spring.GerenciadorDeContas.controller;

import com.Spring.GerenciadorDeContas.Model.EnderecoModel;
import com.Spring.GerenciadorDeContas.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path="/endereco")
    public List<EnderecoModel> mostrarTodosOsEnderecos(){
        return enderecoService.buscarTodosOsEnderecos ();
    }

    @GetMapping(path="/endereco/{endereco_id}")
    public Optional<EnderecoModel> buscarPorId(@PathVariable Long endereco_id){
        return enderecoService.buscarPorId(endereco_id);
    }

    @PostMapping(path="/endereco")
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoModel cadastrar(@RequestBody EnderecoModel enderecoModel){
        return enderecoService.cadastrarEndereco(enderecoModel);
    }

    @PutMapping(path="/endereco/{endereco_id}")
    public EnderecoModel alterar(@RequestBody  EnderecoModel enderecoModel){
        return enderecoService.alterar(enderecoModel);
    }

    @DeleteMapping(path="/endereco/{endereco_id}")
    public void deletar(@PathVariable Long endereco_id){
        enderecoService.deletar(endereco_id);
    }
}
