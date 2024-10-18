package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        //musica
        Musica minhasMusica = new Musica();
        minhasMusica.setTitulo("Um universo de coisas que eu desconheço");
        minhasMusica.setCantor("Lagum");

        for (int i = 0; i < 2500; i++) {
            minhasMusica.reproduz();
        }
        for (int i = 0; i < 950; i++) {
            minhasMusica.curti();
        }
        //podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Não Inviabilise");
        meuPodcast.setApresenador("Déia Freitas");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 400; i++) {
            meuPodcast.curti();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhasMusica);
    }
}
