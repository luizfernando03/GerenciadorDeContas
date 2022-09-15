package com.Spring.GerenciadorDeContas.Service;

import com.Spring.GerenciadorDeContas.Model.CidadeModel;
import com.Spring.GerenciadorDeContas.Repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CidadeService {
        @Autowired
        private CidadeRepository cidadeRepository;
    private Iterable<Long> codigo;

    public CidadeModel cadastrarCidade(CidadeModel cidade){
            return cidadeRepository.save(cidade);
        }

        public List<CidadeModel> buscarTodasAsCidades(){
            return cidadeRepository.findAll();
        }

        public Optional<CidadeModel> buscarCidade(Long codigo){
            return cidadeRepository.findById(codigo);
        }

    public Optional<CidadeModel> buscarPorId(Long cidade_id) {
        return cidadeRepository.findById (cidade_id);
    }

        public CidadeModel alterar(CidadeModel cidadeModel){
            return cidadeRepository.save(alterar (cidadeModel));
        }

        public void deletar(Long codigo){
            cidadeRepository.deleteById(codigo);
        }

}
