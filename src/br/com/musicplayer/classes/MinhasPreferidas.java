package br.com.musicplayer.classes;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e é favorito de todos");
        } else {
            System.out.println(audio.getTitulo() + " está na minha lista de preferidas");
        }
    }
}
