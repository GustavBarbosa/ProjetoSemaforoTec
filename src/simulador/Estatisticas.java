package simulador;

public class Estatisticas {
    private int totalGerados = 0;
    private int totalChegaram = 0;
    private long tempoTotal = 0;

    public void veiculoGerado() {
        totalGerados++;
    }

    public void veiculoChegou(long tempoViagem) {
        totalChegaram++;
        tempoTotal += tempoViagem;
    }

    public void exibirEstatisticas() {
        System.out.println("Total de veículos gerados: " + totalGerados);
        System.out.println("Total de veículos que chegaram: " + totalChegaram);
        if (totalChegaram > 0) {
            System.out.println("Tempo médio de viagem: " + (tempoTotal / totalChegaram) + " ms");
        }
    }

    public int getTotalChegaram() {
        return totalChegaram;
    }

    public int getTotalGerados() {
        return totalGerados;
    }
}
