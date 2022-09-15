package com.Spring.GerenciadorDeContas.Model.calculoRecebimento;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;
import com.Spring.GerenciadorDeContas.Model.Enum.RecibementoAlugueis;

import java.math.BigDecimal;

public class PagamentoAdiantado implements CalculoAlugueis{




    @Override
    public BigDecimal calculoAluguies(BigDecimal valorAReceber) {
        BigDecimal desconto = valorAReceber.multiply (new BigDecimal (0.05));
        BigDecimal resultado = valorAReceber.add (desconto);
        return resultado;
    }

    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorDaConta) {
        return null;
    }

    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        return valorAReceber;
    }

    @Override
    public ContasAReceberModel calcular(ContasAReceberModel contasAReceberModel) {
        return contasAReceberModel;
    }
    public static RecibementoAlugueis ADIANTADO ;

}
