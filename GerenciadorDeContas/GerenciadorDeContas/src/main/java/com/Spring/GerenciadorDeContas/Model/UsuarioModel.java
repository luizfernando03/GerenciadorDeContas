package com.Spring.GerenciadorDeContas.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 20, nullable = false)
    private String nomeUsuario;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(length = 11, nullable = false)
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<ContasApagarModel> contasAPagar = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "usuarioModel", cascade = CascadeType.ALL)
    private List<ContasApagarModel> contasAReceber = new ArrayList<> ();

    @JsonIgnore
    @OneToMany(mappedBy = "usuario_Id", cascade = CascadeType.ALL)
    private List<EnderecoModel> enderecos = new ArrayList<>();

    public UsuarioModel(String nomeUsuario, LocalDate dataNascimento, String email, String cpf) {
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
    }

    public void getId() {

    }
}

