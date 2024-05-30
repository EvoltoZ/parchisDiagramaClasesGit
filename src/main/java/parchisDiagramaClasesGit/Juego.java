/**
 * 
 */
package parchisDiagramaClasesGit;

public class Juego {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        Usuario usuario1 = new Usuario("Angel", "password123");
        Usuario usuario2 = new Usuario("Maria", "password456");

        Jugador jugador1 = new Jugador("Angel", tablero, usuario1);
        Jugador jugador2 = new Jugador("Maria", tablero, usuario2);

        Jugador[] jugadores = {jugador1, jugador2};
        int currentPlayer = 0;

        while (true) {
            Jugador jugador = jugadores[currentPlayer];
            System.out.println(jugador.getNombre() + "'s turn");

            jugador.tirarDado(dado1);
            jugador.tirarDado(dado2);

            int tirada = jugador.consultarDado(dado1) + jugador.consultarDado(dado2);
            System.out.println("Ha salido el " + tirada);

            // For simplicity, always move the first ficha
            jugador.moverFicha(tirada, 0);

            int nuevaPosicion = jugador.consultarTablero();
            System.out.println("La ficha esta en la casilla " + nuevaPosicion);

            if (nuevaPosicion >= tablero.consultarNumCasillas()) {
                System.out.println(jugador.getNombre() + " wins!");
                break;
            }

            currentPlayer = (currentPlayer + 1) % 2;
        }

        System.out.println("Fin del juego");
    }
}

