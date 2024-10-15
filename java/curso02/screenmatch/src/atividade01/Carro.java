package atividade01;

import java.util.Calendar;
import java.util.Date;

public class Carro {
    String modelo;
    int ano;
    String cor;
    Date dataAtual = new Date();

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataAtual);
        int anoAtual = cal.get(Calendar.YEAR);
        return anoAtual - ano;
    }
}
