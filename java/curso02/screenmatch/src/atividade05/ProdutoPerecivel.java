package atividade05;

public class ProdutoPerecivel extends Produto{
    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quanidade, String dataDeValidade) {
        super(nome, preco, quanidade);
        this.dataDeValidade = dataDeValidade;
    }
}
