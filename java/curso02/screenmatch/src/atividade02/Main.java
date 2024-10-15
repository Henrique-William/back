
//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
//Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
//Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
//Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

package atividade02;

import atividade02.contaBancaria.ContaBancaria;
import atividade02.idadePessoa.IdadePessoa;
import atividade02.livro.Livro;
import atividade02.produto.Produto;
import atividade02.aluno.Aluno;

public class Main {
    public static void main(String[] args) {
        //Conta bancaria
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1234);
        conta.setSaldo(1500.50);
        conta.titular = "Henrique";

        System.out.println("\nNúmero da conta: " +conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
        System.out.println("---------------------\n");

        //Idade pessoa
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Henrique");
        pessoa1.setIdade(20);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Lucas");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos\n");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos");
        pessoa2.verificarIdade();

        System.out.println("---------------------\n");

        //Produto
        Produto produto = new Produto();

        produto.setNomeProduto("Sabonete");
        produto.setPrecoProduto(10);
        produto.aplicarDesconto(20);//aplica em porcentagem
        System.out.println(produto.getNomeProduto() + " custa " + produto.getPrecoProduto());
        System.out.println("---------------------\n");

        //Aluno
        Aluno aluno = new Aluno();

        aluno.setNome("Beatriz");
        aluno.setNotas(10, 6, 4);
        aluno.calculaMedia();
        System.out.println("\n---------------------\n");
        //Livro
        Livro livro1 = new Livro();
        livro1.setTitulo("O pequeno principe");
        livro1.setAutor("Antoine de Saint-Exupéry");

        Livro livro2 = new Livro();
        livro2.setTitulo("Diario de um Banana: Rodrick é o cara");
        livro2.setAutor("Jeff Kinney");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        System.out.println("---------------------\n");
    }
}
