package com.Spring.GerenciadorDeContas.Model;

import com.Spring.GerenciadorDeContas.Model.Enum.Status;
import com.Spring.GerenciadorDeContas.Model.Enum.Tipo;
import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "contas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContasApagarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 40, nullable = false)
    private  String nome;

    @Column(name = "Tipo")
    @Enumerated(value = EnumType .STRING)
    private Tipo tipo;

    @Column(length = 10, nullable = false)
    private Double Valor;

    @Column(length = 10, nullable = false)
    private LocalDate dataDeVencimento;

    @Column(length = 10, nullable = false)
    private LocalDateTime dataDePagamento;

    @Column(name = "Status")
    @Enumerated(value = EnumType.STRING)
    private Status status;

    private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    @ManyToOne
    @JoinColumn(name = "usuario_model_codigo")
    private UsuarioModel usuarioModel;

}