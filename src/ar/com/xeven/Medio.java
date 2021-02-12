package ar.com.xeven;

public interface Medio {

    default void subirVolumen(){

    }
    default void bajarVolumen(){

    }
    void reproducir();
    default void pausar(){

    }
    default void detener(){

    }

}
