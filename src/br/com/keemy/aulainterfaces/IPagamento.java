package br.com.keemy.aulainterfaces;

import java.math.BigDecimal;

public interface IPagamento {
    BigDecimal getValorTaxa();

    BigDecimal getValorRecebido(BigDecimal valorPago);
}
