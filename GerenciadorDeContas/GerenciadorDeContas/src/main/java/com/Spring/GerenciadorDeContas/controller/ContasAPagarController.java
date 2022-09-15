package com.Spring.GerenciadorDeContas.controller;

import com.Spring.GerenciadorDeContas.Model.ContasAPagar;
import com.Spring.GerenciadorDeContas.Service.ContasAPagarService;
import com.Spring.GerenciadorDeContas.controller.representation.ContaAPagarRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/contas")
public class ContasAPagarController {

    @Autowired
    private ContasAPagarService contasAPagarService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContasAPagar cadastrar(@RequestBody ContasAPagar contasAPagar) {
        return contasAPagarService.registrarConta (contasAPagar);
    }

    @GetMapping
    public List<ContaAPagarRepresentation> buscar() {

        List<ContasAPagarService> contas = contasAPagarService.buscarTodas ();

        List<ContaAPagarRepresentation> representations = new ArrayList<> ();
        for (ContasAPagar conta : contas) {
            ContaAPagarRepresentation rep = new ContaAPagarRepresentation ();
            rep.setId (conta.getId ());
            rep.setNome (conta.getNome ());
            rep.setStatus (conta.getStatus ());
            rep.setValor (conta.getValor ());

            representations.add (rep);
        }

        return representations;
    }

    @GetMapping(path = "/{id}")
    public Optional<ContasAPagar> buscarPorId(@PathVariable Long id) {
        return contasAPagarService.buscarId (id);
    }

    @PutMapping(path = "/{id}")
    public ContasAPagar atualizar(@PathVariable Long id, @RequestBody ContasAPagar contasAPagar) {
        Optional<ContasAPagar> contaBuscada = contasAPagarService.buscarId (id);
        ContasAPagar conta =  contaBuscada.orElseThrow (() -> new RuntimeException ("Conta não existe."));
        conta.setStatus (contasAPagar.getStatus ());

        return contasAPagarService.atualizar (conta);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable long id) {
        contasAPagarService.deletar (id);
    }
}
