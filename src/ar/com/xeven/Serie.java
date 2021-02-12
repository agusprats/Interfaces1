package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
    private List<Episodio> episodios = new ArrayList<>();

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    public Episodio getEpisodio(int numero){
        return episodios.get(numero);
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
}
