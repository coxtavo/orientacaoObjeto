package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("I stay away");
        minhaMusica.setArtista("Alice in chains");

        for (int i=0; i<1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i=0; i<350; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Origem das piramides");
        meuPodcast.setApresentador("Gustavo Costa");

        for (int i=0; i<5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i=0; i<1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
