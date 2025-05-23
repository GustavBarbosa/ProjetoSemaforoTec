package simulador;

import modelo.Cruzamento;
import modelo.Semaforo;

import java.util.List;

public class ControladorSemaforos {

    public void ajustarSemaforos(List<Cruzamento> cruzamentos) {
        for (Cruzamento c : cruzamentos) {
            Semaforo s = c.getSemaforo();
            if (s != null) {
                s.alternar();
                System.out.println("Semáforo em " + c.getNome() + " agora está " + (s.isAberto() ? "ABERTO" : "FECHADO"));
            }
        }
    }
}
