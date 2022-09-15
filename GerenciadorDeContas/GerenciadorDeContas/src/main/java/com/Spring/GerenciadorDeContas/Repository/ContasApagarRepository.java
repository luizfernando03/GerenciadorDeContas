package com.Spring.GerenciadorDeContas.Repository;

import ch.qos.logback.core.status.Status;
import com.Spring.GerenciadorDeContas.Model.ContasAPagar;
import com.Spring.GerenciadorDeContas.Model.ContasApagarModel;
import com.Spring.GerenciadorDeContas.Model.Enum.Tipo;
import com.Spring.GerenciadorDeContas.Service.ContasAPagarService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContasApagarRepository extends JpaRepository<ContasAPagar, Long> {

    static List<ContasAPagarService> findAll(List<ContasAPagarService> buscarTodas) {
        return buscarTodas;
    }

    List<ContasAPagar> findByStatus(Status status);

    static ContasApagarModel save(ContasApagarModel contaAPagarModel) {
        return contaAPagarModel;
    }
    List<ContasAPagar> findByTipo(Tipo tipo);

    Optional<ContasAPagar> findAll(Long id);

}
