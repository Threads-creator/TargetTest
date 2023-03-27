package org.example.questao3;

import java.util.*;

public class FaturamentoData {

    String mes;
    ArrayList<Map<Integer, Double>> valoresDiarios;

    public FaturamentoData(String mes, ArrayList<Map<Integer, Double>> valoresDiarios){
        this.mes = mes;
        this.valoresDiarios = valoresDiarios;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public ArrayList<Map<Integer, Double>> getValoresDiarios() {
        return valoresDiarios;
    }

    public void setValoresDiarios(ArrayList<Map<Integer, Double>> valoresDiarios) {
        this.valoresDiarios = valoresDiarios;
    }

    @Override
    public String toString() {
        String resultado = "FaturamentoData{" +
                "mes= " + mes + " \n";


        for(int i = 0; i < valoresDiarios.size(); i++) {
            resultado += " | " + valoresDiarios.get(i).keySet() + "  " + valoresDiarios.get(i).values() + " | \n";
        }

        return resultado;
    }
}
