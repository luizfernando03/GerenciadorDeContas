package com.Spring.GerenciadorDeContas.Service;

import com.Spring.GerenciadorDeContas.Model.UsuarioModel;
import com.Spring.GerenciadorDeContas.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> mostrarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorID(Long usuario_id) {
        return usuarioRepository.findById(usuario_id);
    }

    public UsuarioModel cadastrarUsuario(UsuarioModel usuarioModel) {
        usuarioModel.getId();
        usuarioModel.getDataNascimento();
        usuarioModel.getEmail();

        return usuarioRepository.save(usuarioModel);

    }

    public UsuarioModel alterarUsuarioModel(UsuarioModel usuarioModel){

        return usuarioModel;
    }

    public void deletar (Long usuario_id){
        usuarioRepository.deleteById(usuario_id);
    }
}
