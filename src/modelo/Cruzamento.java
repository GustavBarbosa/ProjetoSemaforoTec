package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cruzamento {
    private String nome;
    private List<Rua> ruasConectadas;
    private Semaforo semaforo; // null se não tiver semáforo
    private List<Rua> ruasSaida = new ArrayList<>();

    public Cruzamento(String nome) {
        this.nome = nome;
        this.ruasConectadas = new ArrayList<>();
        this.semaforo = null; // nó sem semáforo
    }

    // método para adição de Saídas para o Carro que tá no nó
    public void adicionarRuaSaida(Rua rua) {
        ruasSaida.add(rua);
    }

    public List<Rua> getRuasSaida() {
        return ruasSaida;
    }

    public String getNome() {
        return nome;
    }

    public List<Rua> getRuasConectadas() {
        return ruasConectadas;
    }

    public void conectarRua(Rua rua) {
        ruasConectadas.add(rua);
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
}
