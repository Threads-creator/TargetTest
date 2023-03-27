package org.example.questao3;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try {
            FaturamentoData faturamentoData = gson.fromJson(new FileReader(System.getProperty("user.dir") + "\\src\\main\\java\\org\\example\\questao3" + "\\Faturamento.json"), FaturamentoData.class);
            System.out.println(faturamentoData);

            System.out.println(Faturamento.encontrarMenorValorFaturamentoDia(faturamentoData));
            System.out.println(Faturamento.encontrarMaiorValorFaturamentoDia(faturamentoData));
            System.out.println(Faturamento.encontrarNumeroDiasAcimaMedia(faturamentoData));

            Faturamento f = new Faturamento(faturamentoData);

            System.out.println(f.encontrarMenorValorFaturamentoDia());
            System.out.println(f.encontrarMaiorValorFaturamentoDia());
            System.out.println(f.encontrarNumeroDiasAcimaMedia());

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo json \n\n " + e);
        }

    }
}
