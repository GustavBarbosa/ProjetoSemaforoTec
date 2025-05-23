package modelo;

import java.util.LinkedList;
import java.util.Queue;

public class Rua {
    private String nome;
    private Cruzamento origem;
    private Cruzamento destino;

    // Duas filas: uma para ida e outra para volta
    private Queue<Veiculo> veiculosIda;
    private Queue<Veiculo> veiculosVolta;

    public Cruzamento getOrigem() {
        return origem;
    }

    public Cruzamento getDestino() {
        return destino;
    }

    public Rua(String nome, Cruzamento origem, Cruzamento destino) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.veiculosIda = new LinkedList<>();
        this.veiculosVolta = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public Queue<Veiculo> getVeiculosIda() {
        return veiculosIda;
    }

    public Queue<Veiculo> getVeiculosVolta() {
        return veiculosVolta;
    }

    // Método para adicionar veículo na direção correta
    public void adicionarVeiculo(Veiculo v, boolean sentidoIda) {
        if (sentidoIda) {
            veiculosIda.add(v);
        } else {
            veiculosVolta.add(v);
        }
    }

    // Método para remover veículo da direção correta
    public void removerVeiculo(Veiculo v, boolean sentidoIda) {
        if (sentidoIda) {
            veiculosIda.remove(v);
        } else {
            veiculosVolta.remove(v);
        }
    }
}
