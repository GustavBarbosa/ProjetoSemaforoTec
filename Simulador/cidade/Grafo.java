package Simulador.cidade;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/** 
 * @author Luís G. C. Barbosa
 */

 public class Grafo {
    private Map<Intersecao, List<Rua>> grafo;

    public Grafo() {
        this.grafo = new HashMap<>();
    }

    public void adicionarRua(Rua rua) {
        grafo.putIfAbsent(rua.getInicioDaRua(), new ArrayList<>());
        grafo.putIfAbsent(rua.getFimDaRua(), new ArrayList<>());
    }
 }



