//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
//Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
//Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

package atividade03;

import atividade03.calculos.*;

public class Main {
    public static void main(String[] args) {
        //1
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);
        //2
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(30,30);
        calculadora.calcularPerimetro(20, 40);
        //3
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);
        //4
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(30);
        conversorTemperatura.fahrenheitParaCelsius(92);
        //5
    }
}
