package com.Spring.GerenciadorDeContas.Repository;

import com.Spring.GerenciadorDeContas.Model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel, Long> {
    static List<EstadoModel> findALl(Object estadosModel) {
        return estadosModel;
    }
}
