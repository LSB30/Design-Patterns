package br.com.alura.Loja.imposto;

import br.com.alura.Loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
