package Jugador;

public class Jugador {

    private String nombre;
    private int vida;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void reducirDanho() {
        vida = vida - 10;

        if (vida < 0) {
            vida = 0;
        }
    }
}
