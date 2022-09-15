package com.Spring.GerenciadorDeContas.Repository;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;
import com.Spring.GerenciadorDeContas.Model.Enum.TipoRecebimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContasAReceberRepository extends JpaRepository<ContasAReceberModel, Long> {

    List<ContasAReceberModel> findByStatus(String status);

    List<ContasAReceberModel> findByTipoRecebido(TipoRecebimento tipoRecebimneto);

    List<ContasAReceberModel> findByDataDeVencimento(LocalDate dataDeVencimento);

    List<ContasAReceberModel> findByTipoRecebimento(String tipoRecebimento);
}
