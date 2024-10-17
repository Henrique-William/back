package atividade03.calculos;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.67;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em real é: R$ " + valorReal);
    }
}
