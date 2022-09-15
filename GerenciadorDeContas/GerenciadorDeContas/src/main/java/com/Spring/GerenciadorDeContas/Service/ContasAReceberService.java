package com.Spring.GerenciadorDeContas.Service;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;
import com.Spring.GerenciadorDeContas.Model.calculoRecebimento.CalculoRecebimentoFactory;
import com.Spring.GerenciadorDeContas.Repository.ContasAReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ContasAReceberService {

    @Autowired
    ContasAReceberRepository contasAReceberRepository;

    public List<ContasAReceberModel> buscarTodos() {
        return contasAReceberRepository.findAll();
    }

    public Optional<ContasAReceberModel> buscarId(Long id) {
        return contasAReceberRepository.findById(id);
    }

    public List<ContasAReceberModel> buscarStatus(String status){return contasAReceberRepository.findByStatus(status);}

    public List<ContasAReceberModel> buscarTiporecebimento(String tipoRecebimento){return contasAReceberRepository.findByTipoRecebimento(tipoRecebimento);}

    public List<ContasAReceberModel>buscarDataDeVencimento(LocalDate dataDeVencimento){return contasAReceberRepository.findByDataDeVencimento(dataDeVencimento);}

    public ContasAReceberModel cadastrar(ContasAReceberModel contasAReceberModel , CalculoRecebimentoFactory recebimentoFactory) {
        return cadastrar (contasAReceberModel , recebimentoFactory);
    }

    public ContasAReceberModel alterar(ContasAReceberModel contasAReceberModel , CalculoRecebimentoFactory calculoRecebimentoFactory) {
        return alterar (contasAReceberModel, calculoRecebimentoFactory);
    }


    public void deletar(Long contasAReceber_id) {
    }
}
