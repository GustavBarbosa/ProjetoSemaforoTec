package main;

import modelo.Cruzamento;
import modelo.Rua;
import simulador.Simulador;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criando cruzamentos
        Cruzamento cruzamentoA = new Cruzamento("Avenida João Ferreira com Rua Jaime Rosa");
        Cruzamento cruzamentoB = new Cruzamento("Avenida João Ferreira com Rua Dois");
        Cruzamento cruzamentoC = new Cruzamento("Rua Dois com Rua Quinze");
        Cruzamento cruzamentoD = new Cruzamento("Rua Quinze com Rua Quatorze");
        Cruzamento cruzamentoE = new Cruzamento("Rua Quatorze com Rua Manoel Franca");
        Cruzamento cruzamentoF = new Cruzamento("Rua Manoel Franca com Rua Anísio Ferreiro Lima");
        Cruzamento cruzamentoG = new Cruzamento("Rua Anísio Ferreira Lima com Rua São Pedro");
        Cruzamento cruzamentoH = new Cruzamento("Rua São Pedro com Rua Epitácio Pessoa");
        Cruzamento cruzamentoI = new Cruzamento("Rua Epitácio Pessoa com Rua Ana Raulino");
        Cruzamento cruzamentoJ = new Cruzamento("Rua Ana Raulino com Rua Domingos Felix do Monte");
        Cruzamento cruzamentoK = new Cruzamento("Rua Domingos Felix do Monte com Rua Jaime Rosa");


        //Criando rua e adicionando como saída para os carros que estarão nos nós
        Rua ruaAB = new Rua("Avenida João Ferreira ->", cruzamentoA, cruzamentoB);
        cruzamentoA.adicionarRuaSaida(ruaAB);
        Rua ruaBA = new Rua("Avenida João Ferreira <-", cruzamentoB, cruzamentoA);
        cruzamentoB.adicionarRuaSaida(ruaBA);

        Rua ruaBC = new Rua("Rua Dois ->", cruzamentoB, cruzamentoC);
        cruzamentoB.adicionarRuaSaida(ruaBC);
        Rua ruaCB = new Rua("Rua Dois <-", cruzamentoC, cruzamentoB);
        cruzamentoC.adicionarRuaSaida(ruaCB);

        Rua ruaCD = new Rua("Rua Quinze ->", cruzamentoC, cruzamentoD);
        cruzamentoC.adicionarRuaSaida(ruaCD);
        Rua ruaDC = new Rua("Rua Quinze <-", cruzamentoD, cruzamentoC);
        cruzamentoD.adicionarRuaSaida(ruaDC);

        Rua ruaDE = new Rua("Rua Quatorze ->", cruzamentoD, cruzamentoE);
        cruzamentoD.adicionarRuaSaida(ruaDE);
        Rua ruaED = new Rua("Rua Quatorze <-", cruzamentoE, cruzamentoD);
        cruzamentoE.adicionarRuaSaida(ruaED);

        Rua ruaEF = new Rua("Rua Manoel Franca ->", cruzamentoE, cruzamentoF);
        cruzamentoE.adicionarRuaSaida(ruaEF);
        Rua ruaFE = new Rua("Rua Manoel Franca <-", cruzamentoF, cruzamentoE);
        cruzamentoF.adicionarRuaSaida(ruaFE);

        Rua ruaFG = new Rua("Rua Anísio Ferreira Lima ->", cruzamentoF, cruzamentoG);
        cruzamentoF.adicionarRuaSaida(ruaFG);
        Rua ruaGF = new Rua("Rua Anízio Ferreira Lima <-", cruzamentoG, cruzamentoF);
        cruzamentoG.adicionarRuaSaida(ruaGF);

        Rua ruaGH = new Rua("Rua São Pedro ->", cruzamentoG, cruzamentoH);
        cruzamentoG.adicionarRuaSaida(ruaGH);
        Rua ruaHG = new Rua("Rua São Pedro <-", cruzamentoH, cruzamentoG);
        cruzamentoH.adicionarRuaSaida(ruaHG);

        Rua ruaHI = new Rua("Rua Epitácio Pessoa ->", cruzamentoH, cruzamentoI);
        cruzamentoH.adicionarRuaSaida(ruaHI);
        Rua ruaIH = new Rua("Rua Epitácio Pessoa <-", cruzamentoI, cruzamentoH);
        cruzamentoI.adicionarRuaSaida(ruaIH);

        Rua ruaIJ = new Rua("Rua Ana Raulino ->", cruzamentoI, cruzamentoJ);
        cruzamentoI.adicionarRuaSaida(ruaIJ);
        Rua ruaJI = new Rua("Rua Ana Raulino <-", cruzamentoJ, cruzamentoI);
        cruzamentoJ.adicionarRuaSaida(ruaJI);

        Rua ruaJK = new Rua("Rua Domingos Felix do Monte ->", cruzamentoJ, cruzamentoK);
        cruzamentoJ.adicionarRuaSaida(ruaJK);
        Rua ruaKJ = new Rua("Rua Domingos Felix do Monte <-", cruzamentoK, cruzamentoJ);
        cruzamentoK.adicionarRuaSaida(ruaKJ);

        Rua ruaKA = new Rua("Rua Jaime Rosa ->", cruzamentoK, cruzamentoA);
        cruzamentoK.adicionarRuaSaida(ruaKA);
        Rua ruaAK = new Rua("Rua Jaime Rosa <-", cruzamentoA, cruzamentoK);
        cruzamentoA.adicionarRuaSaida(ruaAK);
        // Lista dos Cruzamentos
        List<Cruzamento> cruzamentos = new ArrayList<>();
        cruzamentos.add(cruzamentoA);
        cruzamentos.add(cruzamentoB);
        cruzamentos.add(cruzamentoC);
        cruzamentos.add(cruzamentoD);
        cruzamentos.add(cruzamentoE);
        cruzamentos.add(cruzamentoF);
        cruzamentos.add(cruzamentoG);
        cruzamentos.add(cruzamentoH);
        cruzamentos.add(cruzamentoI);
        cruzamentos.add(cruzamentoJ);
        cruzamentos.add(cruzamentoK);

        // inicializador da simulação
        Simulador simulador = new Simulador(cruzamentos);

        // método para dar start no simulador
        simulador.executarSimulacao();
    }
}
