package atividade02.livro;

public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor do livro: " + this.autor);
    }
}
