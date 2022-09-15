package com.Spring.GerenciadorDeContas.Service;

import com.Spring.GerenciadorDeContas.Model.ContasAPagar;
import com.Spring.GerenciadorDeContas.Model.ContasApagarModel;
import com.Spring.GerenciadorDeContas.Model.Enum.Tipo;
import com.Spring.GerenciadorDeContas.Repository.ContasApagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import java.util.List;
import java.util.Optional;

import static com.Spring.GerenciadorDeContas.Model.Enum.Status.*;


@Service
public class ContasAPagarService extends ContasAPagar {
    @Autowired
    private ContasApagarRepository contasApagarRepository;

    public List<ContasAPagarService> buscarTodas() {
        return ContasApagarRepository.findAll(buscarTodas ());
    }
    public Optional<ContasAPagar> buscarId(Long id) {
        return contasApagarRepository.findAll (id);
    }

    public ContasApagarModel buscarStatusConta(ContasApagarModel contaAPagarModel) {
        return ContasApagarRepository.save (contaAPagarModel);
    }

    public List<ContasAPagar> buscarPorTipo(Tipo tipo) {
        return contasApagarRepository.findByTipo (tipo);
    }

    public ContasAPagar registrarConta(ContasAPagar contasAPagar) {

        if (contasAPagar.estaVencida ()) {
            contasAPagar.getStatus (VENCIDA);
        } else {
            contasAPagar.setStatus (AGUARDANDO);
        }
        return contasApagarRepository.save (contasAPagar);
    }

    public ContasAPagar atualizar(ContasAPagar contasAPagarModel) {
        if (contasAPagarModel.getStatus().equals(PAGO)) {
            LocalDateTime dataAtual = LocalDateTime.now ();
            contasAPagarModel.setDataDePagamento (dataAtual);
        }
        return contasApagarRepository.save(contasAPagarModel);
    }
    public void deletar(Long id) {
        contasApagarRepository.deleteById (id);
    }
}