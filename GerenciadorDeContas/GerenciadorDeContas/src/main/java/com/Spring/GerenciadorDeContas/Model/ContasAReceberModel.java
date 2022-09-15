package com.Spring.GerenciadorDeContas.Model;

import com.Spring.GerenciadorDeContas.Model.Enum.RecibementoAlugueis;
import com.Spring.GerenciadorDeContas.Model.Enum.Tipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "receber")
public class ContasAReceberModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 25, nullable = false)
    private String status;

    @Column(length = 25, nullable = false)
    private String recebimento;

    @Column(nullable = false)
    private BigDecimal valorRecebido;

    private BigDecimal valorFinal;

    @Column(nullable = false)
    private Tipo tipoRecebimento;

    private RecibementoAlugueis recebimentoAlugueis;

    @Column(nullable = false)
    private LocalDate dataDeVencimento;

    private LocalDateTime dataDeRecebimento;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "codigo")
    private UsuarioModel usuario;

}
