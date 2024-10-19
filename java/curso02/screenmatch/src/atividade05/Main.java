package atividade05;
//Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
//Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().
//Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
//Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto playStation = new Produto("Playstation 5", 3990, 200);
        Produto nintendoSwitch = new Produto("Nintendo Switch", 2350, 300);
        Produto televisao = new Produto("Televisão Samsung", 2500, 500);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(playStation);
        lista.add(nintendoSwitch);
        lista.add(televisao);
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println("Tamanho da lista: " + lista.size());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Maçã", 5.99, 500, "19-11-2024");
        System.out.println(produtoPerecivel);
    }
}
