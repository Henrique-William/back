import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while(nota != -1){
            System.out.println("Diga a sua avaliação do filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            } else if (nota == 0) {
                System.out.println("");
            }
        }
        System.out.println("Media de avaliações " + mediaAvaliacao / totalDeNotas);
    }
}
