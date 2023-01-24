package br.com.keemy.aulainterfaces;

import java.math.BigDecimal;
import java.util.Formatter;

public class Venda {

    private BigDecimal valorVenda;
    private Maquininha maquininha;

    private Venda(){

    }

    public Venda(BigDecimal valorVenda, Maquininha maquininha) {
        this.valorVenda = valorVenda;
        this.maquininha = maquininha;
    }

    public BigDecimal getValorRecebido(){
        return this.maquininha.getValorRecebido(this.valorVenda);
    }

    public String getDescricaoMaquininha(){
        return this.maquininha.getTipoMaquininha().toString();
    }


    public String  getMessageVenda() {
        Formatter formatter = new Formatter();

        return formatter.format("Valor da venda %.2f.%n" +
                        "Tipo da venda: %s.%n" +
                        "Valor recebido: %.2f.%n" +
                        "Taxa de %.2f%%",
                this.valorVenda, this.getDescricaoMaquininha(), this.getValorRecebido(), this.maquininha.getValorTaxa()).toString();
    }


}
