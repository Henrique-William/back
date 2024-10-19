package atividade06.modelos;

public class Circulo implements Forma {
    public double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
