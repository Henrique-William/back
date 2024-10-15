//O desafio consiste em fazer um sistema com algumas transações bancarias.

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //dados iniciais
        String nome = "Henrique Silva";
        String tipoConta = "Corrente";
        double saldo = 6000;

        System.out.printf("""
                *****************************
                Dados do Cliente:
                
                Nome: %s
                Tipo da Conta: %s
                Saldo Inicial: %.2f
                *****************************
                """, nome, tipoConta, saldo);

        //menu
        Scanner entrada = new Scanner(System.in);
        int opcaoMenu = 0;

        while(opcaoMenu < 4 || opcaoMenu < 0) {
            System.out.println("""
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);

            opcaoMenu = entrada.nextInt();
            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor à receber");
                    double valorReceber = entrada.nextDouble();
                    saldo += valorReceber;
                    System.out.println("\nValor recebido!");
                    break;
                case 3:
                    System.out.println("Digite o valor à transferir");
                    double valorTransferir = entrada.nextDouble();
                    if(valorTransferir > saldo) {
                        System.out.println("\nValor inválido!");
                    } else {
                        saldo -= valorTransferir;
                        System.out.println("\nValor Transferido!");
                    }
                    break;
                case 4:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    break;
            }
        }
    }
}
