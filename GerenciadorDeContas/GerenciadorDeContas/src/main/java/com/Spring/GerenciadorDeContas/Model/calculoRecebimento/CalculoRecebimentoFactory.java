package com.Spring.GerenciadorDeContas.Model.calculoRecebimento;

import com.Spring.GerenciadorDeContas.Model.ContasAReceberModel;

public class CalculoRecebimentoFactory {
    public CalculoAlugueis calculoAlugueis(ContasAReceberModel contasAReceberModel) {
        if (contasAReceberModel.getRecebimentoAlugueis().equals(PagamentoAdiantado.ADIANTADO)) {
            return new PagamentoAdiantado ();
        } else if (contasAReceberModel.getRecebimentoAlugueis().equals(CalculoAlugueis.EM_DIA)) {
            return new PagamentoEmDia ();
        } else if (contasAReceberModel.getRecebimentoAlugueis().equals(CalculoAlugueis.EM_ATRASO)) {
            return new PagamentoAtrasado ();
        } else {
            return null;
        }
    }

}
