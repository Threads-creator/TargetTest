package org.example.questao4;

import java.util.*;

public class FaturamentoMes {

    public static HashMap<String, Double> porcentagemPorFaturamentoMensal(HashMap<String, Double> faturamentoMensal){
        var iterator = faturamentoMensal.values();

        double total = iterator.stream().reduce(0.0, (t, x) -> t + x);

        ArrayList<Double> porcentagens = new ArrayList<>();
        var iterable = faturamentoMensal.values().iterator();
        while(iterable.hasNext()){
            var porcentagem = iterable.next() / total;
            porcentagens.add(porcentagem);
        }

        HashMap<String, Double> resultado = new HashMap<>();
        int i = 0;
        var iterable2 = faturamentoMensal.keySet().iterator();
        while(iterable2.hasNext()){
            resultado.put(iterable2.next(), porcentagens.get(i) * 100.0);
            i++;
        }

        return resultado;
    }
}
