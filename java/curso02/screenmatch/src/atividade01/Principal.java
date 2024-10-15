package atividade01;

public class Principal {

    public static void main(String[] args) {
        //pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        //calculadora
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.calcularDobro(5);
        System.out.println(resultado);

        //musica
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Telefone";
        minhaMusica.artista = "Lagum";
        minhaMusica.anoLancamento = 2017;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.printf("Média das avaliações: %.2f \n", mediaAvaliacoes);

        //carro
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Etios";
        meuCarro.ano = 2018;
        meuCarro.cor = "Branco";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");

        //aluno
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Henrique";
        meuAluno.idade = 20;

        meuAluno.exibeInformacoes();
    }
}
