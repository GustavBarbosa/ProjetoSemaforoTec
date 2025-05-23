package modelo;

public class Semaforo {
    private boolean aberto;

    public Semaforo() {
        this.aberto = true; // Tá no verde por padrão
    }

    public boolean isAberto() {
        return aberto;
    }

    public void alternar() {
        aberto = !aberto;
    }
}
