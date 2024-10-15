package atividade02.aluno;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double nota1, double nota2,double nota3) {
        if (nota1 > 10 || nota2 > 10 || nota3 > 10 || nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Erro ao gerar nota do aluno");
        } else {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }
    }

    public void calculaMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 6) {
            System.out.printf("Aluno(a) " + nome + " Aprovado com a nota %.2f", media);
        } else {
            System.out.printf("Aluno(a) " + nome + " Reprovado com a nota %.2f", media);
        }
    }

}
