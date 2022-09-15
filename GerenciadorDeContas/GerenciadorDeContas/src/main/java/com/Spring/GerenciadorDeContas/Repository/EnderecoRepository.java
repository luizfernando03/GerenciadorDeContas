package com.Spring.GerenciadorDeContas.Repository;

import com.Spring.GerenciadorDeContas.Model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {
}
