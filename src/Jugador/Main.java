package Jugador;

public class Main {
    public static void main(String[] args) {

        Jugador[] jugadores = new Jugador[4];

        jugadores[0] = new Jugador("Messi", 70);
        jugadores[1] = new Jugador("Cristiano", 50);
        jugadores[2] = new Jugador("Mella", 90);
        jugadores[3] = new Jugador("Yeremay", 20);

        int muertos = 0;

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].reducirDanho();
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
