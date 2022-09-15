package com.Spring.GerenciadorDeContas.Model.calculoRecebimento;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoAlugueis{


    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorDaConta) {
        return valorDaConta;
    }

    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        return valorAReceber;
    }

    @Override
    public ContasAReceberModel calcular(ContasAReceberModel contasAReceberModel) {
        return new ContasAReceberModel ();
    }

    @Override
    public BigDecimal calculoAluguies(BigDecimal valorAReceber) {
        return valorAReceber;
    }


}
