package br.com.alura.Loja.imposto;

import br.com.alura.Loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
