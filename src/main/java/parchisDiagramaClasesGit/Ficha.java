/**
 * 
 */
package parchisDiagramaClasesGit;

public class Ficha {
    private int posicion;

    public Ficha() {
        this.posicion = 0;
    }

    public void mover(int cs) {
        this.posicion += cs;
    }

    public int getPosicion() {
        return posicion;
    }
}

