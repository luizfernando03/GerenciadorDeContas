package com.Spring.GerenciadorDeContas.Model.Enum;

public enum RecibementoAlugueis {

    EM_ATRASADO, EM_DIA, ADIANTADO;

  public RecibementoAlugueis getEmAtrasado(){
      return EM_ATRASADO;
  }

  public RecibementoAlugueis getEmDia(){
      return EM_DIA;
  }
  public RecibementoAlugueis getAdiantado(){
      return ADIANTADO;
  }
}
