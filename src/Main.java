import br.com.keemy.aulainterfaces.Maquininha;
import br.com.keemy.aulainterfaces.Utils.TipoMaquininha;
import br.com.keemy.aulainterfaces.Venda;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Venda venda;


        for (TipoMaquininha tipo: TipoMaquininha.values()) {
            System.out.println("********************************************8");
            System.out.printf("Venda [%s]%n", tipo.toString());
            System.out.println("********************************************8");
            venda = new Venda(
                    new BigDecimal(1000),
                    new Maquininha(tipo)
            );
            System.out.println(venda.getMessageVenda() + "\n");
        }


    }
}