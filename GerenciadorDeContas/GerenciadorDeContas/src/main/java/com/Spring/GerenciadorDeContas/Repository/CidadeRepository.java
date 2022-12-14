package com.Spring.GerenciadorDeContas.Repository;

import com.Spring.GerenciadorDeContas.Model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeModel, Long> {
}
