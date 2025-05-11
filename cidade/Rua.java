package cidade;

public class Rua {
    private Intersecao origem;
    private Intersecao destino;
    private int tempoTravessia;

    public Rua(Intersecao origem, Intersecao destino, int tempoTravessia) {
        this.origem = origem;
        this.destino = destino;
        this.tempoTravessia = tempoTravessia;
    }

    public int getTempoTravessia() {
        return tempoTravessia;
    }
}
