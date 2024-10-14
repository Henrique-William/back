import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de Lançamento?");
        int anoDelancamento = leitura.nextInt();

        System.out.println("Diga a sua avaliação do filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDelancamento);
        System.out.println(avaliacao);
    }
}