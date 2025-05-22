package Simulador.cidade;

import java.util.LinkedList;
import java.util.Queue;

public class Rua {
    private String nomeDaRua;
    private Intersecao inicioDaRua;
    private Intersecao fimDaRua;
    private Queue<String> filaDeCarros;

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setInicioDaRua(Intersecao inicioDaRua) {
        this.inicioDaRua = inicioDaRua;
    }

    public Intersecao getInicioDaRua() {
        return inicioDaRua;
    }

    public void setFimDaRua(Intersecao fimDaRua) {
        this.fimDaRua = fimDaRua;
    }

    public Intersecao getFimDaRua() {
        return fimDaRua;
    }

    public Rua(String nome, Intersecao inicioDaRua, Intersecao fimDaRua) {
        this.nomeDaRua = nomeDaRua;
        this.inicioDaRua = inicioDaRua;
        this.fimDaRua = fimDaRua;
        this.filaDeCarros = new LinkedList<>();
    }

}
