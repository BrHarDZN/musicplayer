package br.com.musicplayer.principal;

import br.com.musicplayer.classes.MinhasPreferidas;
import br.com.musicplayer.classes.Musica;
import br.com.musicplayer.classes.Podcast;

public class Principal {
    public static void main(String args[]) {
        Musica numb = new Musica();
        numb.setTitulo("Numb - Linkin park");
        numb.setArtista("Chester Bennington");

        for (int i = 0; i < 2000; i++) {
            numb.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            numb.curtir();
        }


        Podcast flow = new Podcast();
        flow.setTitulo("Flow Podcast");
        flow.setHost("Igor Rodrigues Coelho");

        for (int i = 0; i < 1000; i++) {
            flow.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            flow.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(flow);
        minhasPreferidas.inclui(numb);

    }
}
