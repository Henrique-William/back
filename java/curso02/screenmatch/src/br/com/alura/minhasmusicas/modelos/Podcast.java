package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresenador;
    private String Descricao;

    public String getApresenador() {
        return apresenador;
    }

    public void setApresenador(String apresenador) {
        this.apresenador = apresenador;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
