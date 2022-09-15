package com.Spring.GerenciadorDeContas.controller;

import com.Spring.GerenciadorDeContas.Model.CidadeModel;
import com.Spring.GerenciadorDeContas.Service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidade/{cidade_id}")
    public Optional<CidadeModel> buscarPorId(@PathVariable Long cidade_id){
        return cidadeService.buscarPorId(cidade_id);
    }

    @PostMapping(path = "/cidade")
    @ResponseStatus(HttpStatus.CREATED)
    public CidadeModel cadastrar(@RequestBody CidadeModel cidadeModel){
        return cidadeService.cadastrarCidade (cidadeModel);
    }

    @PutMapping(path = "/cidade/{cidade_id}")
    public CidadeModel alterar(@RequestBody CidadeModel cidadeModel){
        return cidadeService.alterar(cidadeModel);
    }

    @DeleteMapping(path = "/cidade/{cidade_id}")
    public void deletar(@PathVariable Long cidade_id){
        cidadeService.deletar(cidade_id);
    }
}
