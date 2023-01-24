package br.com.keemy.aulainterfaces;

import java.math.BigDecimal;


public class Maquininha implements IPagamento{
    static final double TAXA_CARTAO = 9.99;
    static final double TAXA_AVISTA = 0.99;
    static final double TAXA_DEBITO = 5.0;

    private Utils.TipoMaquininha tipoMaquininha;

    private Maquininha(){};

    public Maquininha(Utils.TipoMaquininha tipoMaquininha){
        this.tipoMaquininha = tipoMaquininha;
    }

    @Override
    public BigDecimal getValorTaxa() {
        BigDecimal retorno = null;

        switch (tipoMaquininha){
            case MAQUININHA_CREDITO:
                retorno = new BigDecimal(TAXA_CARTAO);
                break;
            case MAQUININHA_AVISTA:
                retorno = new BigDecimal(TAXA_AVISTA);
                break;
            case MAQUININHA_DEBITO:
                retorno = new BigDecimal(TAXA_DEBITO);
                break;

        }
        return retorno;
    }

    @Override
    public BigDecimal getValorRecebido(BigDecimal valorPago) {
        return getFator().multiply(valorPago);
    }

    public BigDecimal getFator(){
        return (
                new BigDecimal(1).subtract(
                        getValorTaxa().divide(new BigDecimal(100.0))
                )
        );
    }

    public Utils.TipoMaquininha getTipoMaquininha() {
        return tipoMaquininha;
    }

}
