package br.com.alura.minhascompras;

import java.util.Scanner;
import java.util.Collections;
import br.com.alura.minhascompras.models.Cartao;
import br.com.alura.minhascompras.models.Compra;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do limite do seu Cartão de Crédito: ");
        double limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);
        
        int menu = 1;
        while (menu != 0) {
            System.out.println("Digite a descrição da Compra: ");
            String nomeProduto = leitura.next();

            System.out.println("Digite o valor do produto: ");
            double precoProduto = leitura.nextDouble();

            Compra compra = new Compra(nomeProduto, precoProduto);
            boolean compraEfetuada = cartao.lancaCompra(compra);
            if (compraEfetuada) {
                System.out.println("Compra Efetuada!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                menu = leitura.nextInt();

            } else {
                System.out.println("Saldo insulficiente!");
                menu = 0;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("COMPRAS REALIZADAS \n");

        Collections.sort(cartao.getCompras());

        for (Compra listCompra : cartao.getCompras()){
            System.out.println(listCompra.getDescricao() + " - R$ " + listCompra.getValor());
        }
        System.out.println("\n--------------------------------");
        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}