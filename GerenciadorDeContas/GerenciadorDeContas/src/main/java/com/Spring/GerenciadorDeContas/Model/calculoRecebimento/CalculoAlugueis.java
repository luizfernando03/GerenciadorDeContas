package com.Spring.GerenciadorDeContas.Model.calculoRecebimento;


import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;
import com.Spring.GerenciadorDeContas.Model.Enum.RecibementoAlugueis;

import java.math.BigDecimal;

public interface CalculoAlugueis {

    ContasAReceberModel calcular(ContasAReceberModel contasAReceberModel);

    BigDecimal calcularValorDaConta(BigDecimal valorDaConta);

    BigDecimal calcular(BigDecimal valorAReceber);

    BigDecimal calculoAluguies(BigDecimal valorAReceber);

    RecibementoAlugueis EM_DIA = RecibementoAlugueis.EM_DIA;

    RecibementoAlugueis EM_ATRASO = RecibementoAlugueis.EM_ATRASADO ;
}
