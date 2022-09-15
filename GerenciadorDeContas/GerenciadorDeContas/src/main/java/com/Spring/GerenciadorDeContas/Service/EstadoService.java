package com.Spring.GerenciadorDeContas.Service;

import com.Spring.GerenciadorDeContas.Model.EstadoModel;
import com.Spring.GerenciadorDeContas.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;
    private Object estadosModel;

    public List<EstadoModel> buscarTodos() {
        List<EstadoModel> estados = estadoRepository.findAll();
        return EstadoRepository.findALl(estadosModel);
    }

    public Optional<EstadoModel> buscarPorId(Long codigo) {
        return estadoRepository.findById(codigo);
    }
    public List<EstadoModel> mostrarTodosEstados() {
        return estadoRepository.findAll ();
    }

    public EstadoModel cadastrar(EstadoModel estadoModel) {
        return estadoRepository.save(estadoModel);
    }

    public EstadoModel alterar(EstadoModel estadoModel) {
        return estadoRepository.save(estadoModel);
    }

    public void deletar(Long codigo) {
        estadoRepository.deleteById(codigo);
    }


}
