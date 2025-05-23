package simulador;

import modelo.Cruzamento;
import modelo.Veiculo;

public class GeradorVeiculos {
    private int contador = 0;

    public Veiculo gerarVeiculo(Cruzamento origem, Cruzamento destino) {
        contador++;
        boolean sentidoIda = Math.random() < 0.5; // Sorteia ida ou volta
        Veiculo v = new Veiculo("V" + contador, origem, destino, sentidoIda);
        v.getRota().add(origem); 
        v.getRota().add(destino);
        return v;
    }
}
