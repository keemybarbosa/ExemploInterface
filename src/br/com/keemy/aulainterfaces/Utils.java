package br.com.keemy.aulainterfaces;

public final class Utils {
    public enum TipoMaquininha {
        MAQUININHA_AVISTA("Crédito a vista"),
        MAQUININHA_DEBITO("Débito"),
        MAQUININHA_CREDITO("Crédito");

        String texto;

        TipoMaquininha(String s) {
            this.texto = s;
        }


        @Override
        public String toString() {
            return this.texto;
        }
    }
}
