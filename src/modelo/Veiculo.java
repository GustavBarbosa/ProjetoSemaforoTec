package modelo;

import java.util.LinkedList;
import java.util.Queue;

public class Veiculo {
    private String id;
    private Cruzamento origem;
    private Cruzamento destino;
    private Queue<Cruzamento> rota;
    private long tempoInicio;
    private boolean sentidoIda; // true = ida, false = volta

    public Veiculo(String id, Cruzamento origem, Cruzamento destino, boolean sentidoIda) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.rota = new LinkedList<>();
        this.tempoInicio = System.currentTimeMillis();
        this.sentidoIda = sentidoIda;
    }

    public String getId() {
        return id;
    }

    public Cruzamento getOrigem() {
        return origem;
    }

    public Cruzamento getDestino() {
        return destino;
    }

    public Queue<Cruzamento> getRota() {
        return rota;
    }

    public long getTempoInicio() {
        return tempoInicio;
    }

    public boolean isSentidoIda() {
        return sentidoIda;
    }

    public void setSentidoIda(boolean sentidoIda) {
        this.sentidoIda = sentidoIda;
    }
}
