package atividade04;

public class Pessoa {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: (" + idade + " anos)";
    }

}
