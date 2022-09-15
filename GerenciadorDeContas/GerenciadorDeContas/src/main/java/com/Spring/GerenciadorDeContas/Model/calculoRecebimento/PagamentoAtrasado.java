package com.Spring.GerenciadorDeContas.Model.calculoRecebimento;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;

import java.math.BigDecimal;

public class PagamentoAtrasado implements CalculoAlugueis{

    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorDaConta) {
        BigDecimal valorComAtraso =
                valorDaConta.add(valorDaConta.multiply( BigDecimal.valueOf(0.035)));
        return valorComAtraso;
    }


    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        return valorAReceber;
    }

    @Override
    public ContasAReceberModel calcular(ContasAReceberModel contasAReceberModel) {
        return contasAReceberModel;
    }

    @Override
    public BigDecimal calculoAluguies(BigDecimal valorAReceber) {
        return valorAReceber;
    }
}
