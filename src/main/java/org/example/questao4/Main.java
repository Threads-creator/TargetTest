package org.example.questao4;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Double> valores = new HashMap<>();
        valores.put("SP", 67836.43);
        valores.put("RJ", 36678.66);
        valores.put("MG", 29229.88);
        valores.put("ES", 27165.48);
        valores.put("Outros", 19849.53);
        var r = FaturamentoMes.porcentagemPorFaturamentoMensal(valores);
        r.entrySet().forEach(
                i -> System.out.println(String.format("%s = %.2f %%", i.getKey(), i.getValue())));
    }
}
