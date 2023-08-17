package br.com.alura.Loja;

import br.com.alura.Loja.imposto.CalculadoraDeImpostos;
import br.com.alura.Loja.imposto.ISS;
import br.com.alura.Loja.imposto.Imposto;
import br.com.alura.Loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
