package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >=8) {
            System.out.println(audio.getTitulo() + "Musica muito boa");
        } else {
            System.out.println(audio.getTitulo() + "bom tbm mas nem tanto");
        }
    }
}
