package simulador;

import modelo.Cruzamento;
import modelo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Simulador {
    private List<Cruzamento> cruzamentos;
    private List<Veiculo> veiculosEmMovimento;
    private GeradorVeiculos gerador;
    private Estatisticas estatisticas;
    private ControladorSemaforos controlador;

    private final int TOTAL_VEICULOS = 1000;

    public Simulador(List<Cruzamento> cruzamentos) {
        this.cruzamentos = cruzamentos;
        this.veiculosEmMovimento = new ArrayList<>();
        this.gerador = new GeradorVeiculos();
        this.estatisticas = new Estatisticas();
        this.controlador = new ControladorSemaforos();
    }

    public void executarSimulacao() {
        int ciclo = 0;
        while (estatisticas.getTotalChegaram() < 1000) {
            ciclo++;
            System.out.println("\n================ CICLO " + ciclo + " ================");

            // 1 - Ajustar semáforos
            controlador.ajustarSemaforos(cruzamentos);
            System.out.println("[INFO] Semáforos ajustados.");

            // 2 - Gerar veículo
            Cruzamento origem = cruzamentos.get((int) (Math.random() * cruzamentos.size()));
            Cruzamento destino = cruzamentos.get((int) (Math.random() * cruzamentos.size()));

            if (!origem.equals(destino)) {
                Veiculo v = gerador.gerarVeiculo(origem, destino);
                veiculosEmMovimento.add(v);
                estatisticas.veiculoGerado();

                System.out.println("[GERADOR] Veículo gerado:");
                System.out.println("-> Origem: " + origem.getNome());
                System.out.println("-> Destino: " + destino.getNome());
            }

            // 3 - Mover veículos
            moverVeiculos();
            System.out.println("[TRÂNSITO] Movimentação dos veículos realizada.");

            // 4 - Estatísticas
            estatisticas.exibirEstatisticas();

            System.out.println("=========================================");

            try {
                Thread.sleep(500); // meio segundo entre ciclos para visualização
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moverVeiculos() {
        List<Veiculo> chegaram = new ArrayList<>();

        for (Veiculo v : veiculosEmMovimento) {
            if (!v.getRota().isEmpty()) {
                // Simula movimentação: remove o próximo cruzamento
                v.getRota().poll();
            } else {
                long tempoViagem = System.currentTimeMillis() - v.getTempoInicio();
                estatisticas.veiculoChegou(tempoViagem);
                chegaram.add(v);

                // Mostra no prompt
                System.out.println("Veículo chegou ao destino em " + tempoViagem + " ms.");
            }
        }

        // Remove veículos que chegaram
        veiculosEmMovimento.removeAll(chegaram);
    }
}
