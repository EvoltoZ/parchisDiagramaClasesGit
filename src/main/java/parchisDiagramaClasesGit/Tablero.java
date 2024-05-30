/**
 * 
 */
package parchisDiagramaClasesGit;

public class Tablero {
    private int numCasillas;
    private int[] casillas;

    public Tablero() {
        numCasillas = 21;
        casillas = new int[numCasillas];
        casillas[0] = 1; // Player 1's ficha at start
    }

    public Tablero(int numCasillas) {
        this.numCasillas = numCasillas;
        casillas = new int[numCasillas + 1];
        casillas[0] = 1;
    }

    public void cambiarFicha(int origen, int destino) {
        casillas[origen] = 0;
        casillas[destino] = 1;
    }

    public int consultarNumCasillas() {
        return numCasillas;
    }

    public int[] consultarCasillas() {
        return casillas;
    }
}

