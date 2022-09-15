package com.Spring.GerenciadorDeContas.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "enderco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 25, nullable = false)
    private String logradouro;

    @Column(length = 25, nullable = false)
    private String bairro;

    @Column(length = 9, nullable = false)
    private String cep;

    @Column(length = 40, nullable = false)
    private String pontoReferencia;

    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "codigo")
    private CidadeModel cidade;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "codigo")
    private UsuarioModel usuario;

    @ManyToOne
    @JoinColumn(name = "usuario_model_codigo")
    private UsuarioModel usuarioModel;

    public EnderecoModel(String logradouro, String bairro, String cep, String pontoReferencia, CidadeModel cidade, UsuarioModel usuario) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.pontoReferencia = pontoReferencia;
        this.cidade = cidade;
        this.usuario = usuario;
    }

}
