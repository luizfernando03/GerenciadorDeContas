package com.Spring.GerenciadorDeContas.Service;

import com.Spring.GerenciadorDeContas.Model.EnderecoModel;
import com.Spring.GerenciadorDeContas.Model.EstadoModel;
import com.Spring.GerenciadorDeContas.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoModel cadastrarEndereco(EnderecoModel enderecoModel){
        return enderecoRepository.save(enderecoModel);
    }

    public List<EnderecoModel> buscarTodosOsEnderecos(){
        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> buscarEndereco(Long codigo){
        return enderecoRepository.findById(codigo);
    }
    public Optional<EnderecoModel> buscarPorId(Long endereco_id) {
        return enderecoRepository.findById (endereco_id);
    }

    public EnderecoModel alterar(EnderecoModel alterandoEndereco){
        return enderecoRepository.save(alterandoEndereco);
    }

    public void deletar(Long codigo){
        enderecoRepository.deleteById(codigo);
    }



}
