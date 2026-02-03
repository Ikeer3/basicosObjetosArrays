package Jugador;

public class Main {
    public static void main(String[] args) {

        Jugador[] jugadores = new Jugador[4];

        jugadores[0] = new Jugador("Messi", 0);
        jugadores[1] = new Jugador("Cristiano", 0);
        jugadores[2] = new Jugador("Mella", 90);
        jugadores[3] = new Jugador("Yeremay", 10);

        int muertos = 0;

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getVida() > 0) {
                System.out.print("\nEl jugador " + jugadores[i].getNombre() + " tiene " + jugadores[i].getVida() + " puntos de vida");
            } else if (jugadores[i].getVida() == 0) {
                muertos++;
            }
        }
        System.out.print("\n---------------------------------------------");
        System.out.print("\nHay " + muertos + " jugadores muertos");
    }
}
