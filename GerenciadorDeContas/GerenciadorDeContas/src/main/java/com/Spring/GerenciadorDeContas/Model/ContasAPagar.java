package com.Spring.GerenciadorDeContas.Model;

import ch.qos.logback.core.status.Status;
import com.Spring.GerenciadorDeContas.Model.Enum.Tipo;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "conta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContasAPagar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length = 40, nullable = false)
    private  String nome;
    @Column(name = "Status")
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Column(name = "Tipo")
    @Enumerated(value = EnumType .STRING)
    private Tipo tipo;
    @Column(name = "data_de_vencimento", length = 10, nullable = false)
    private LocalDate dataDeVencimento;
    @Column (name = "data_de_pagamento")
    private LocalDateTime dataDePagamento;
    @Column(length = 10, nullable = false)
    private Double Valor;

    public boolean estaVencida() {return LocalDate.now ().isAfter ( this.getDataDeVencimento ());
    }
    public void getStatus(com.Spring.GerenciadorDeContas.Model.Enum.Status vencida) {
    }
}