package atividade02.idadePessoa;

public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if(idade >= 18){
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}
