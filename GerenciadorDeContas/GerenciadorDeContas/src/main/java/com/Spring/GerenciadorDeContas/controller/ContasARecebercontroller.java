package com.Spring.GerenciadorDeContas.controller;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;
import com.Spring.GerenciadorDeContas.Model.calculoRecebimento.CalculoRecebimentoFactory;
import com.Spring.GerenciadorDeContas.Service.ContasAReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ContasARecebercontroller {

    @Autowired
    public ContasAReceberService contasAReceberService;

    @GetMapping(path = "/contasAReceber")
    public List<ContasAReceberModel> buscarContas() {
        return contasAReceberService.buscarTodos ();
    }

    @GetMapping(path = "/contasAReceber/{contasAReceber_id}")
    public Optional<ContasAReceberModel>buscarPorId(@PathVariable Long contasAReceber_id){
        return contasAReceberService.buscarId (contasAReceber_id);
    }

    @PostMapping(path = "/contasAReceber")
    @ResponseStatus(HttpStatus.CREATED)
    public ContasAReceberModel cadastrar(@RequestBody ContasAReceberModel contasAReceberModel, CalculoRecebimentoFactory recebimentoFactory){
        return contasAReceberService.cadastrar(contasAReceberModel, recebimentoFactory);
    }

    @PutMapping(path = "/contaAReceber/{contasAReceber_id}")
    public ContasAReceberModel alterar(@RequestBody ContasAReceberModel contasAReceberModel, CalculoRecebimentoFactory calculoRecebimentoFactory){
        return contasAReceberService.alterar(contasAReceberModel, calculoRecebimentoFactory );
    }

    @DeleteMapping(path = "/contasAReceber/{contasAReceber_id}")
    public void deletar(@PathVariable Long contasAReceber_id ) {
        contasAReceberService.deletar(contasAReceber_id);
    }

    }
