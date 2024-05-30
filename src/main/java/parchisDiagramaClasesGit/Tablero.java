/**
 * 
 */
package parchisDiagramaClasesGit;

/**
 * 
 */
public class Tablero {

	private int numCasillas;
	private int[] casillas; //Cada casilla tiene asociado un numero (0: no ficha , 1:jugador 1, 2:ficha jugador, 3: 2 fichas jugador 1, 4: 2 fichas jugador 2
	
	/**
	 * 
	 */
	public Tablero() {
		
		numCasillas = 21;
		casillas = new boolean[numCasillas];
		casillas[0] = true;
		
	}
	
	/**
	 * @param numCasillas
	 */
	public Tablero(int numCasillas) {	
		
		this.numCasillas = numCasillas;
		casillas = new boolean[numCasillas+1];
		casillas[0] = true;
		
	}
	
	public void cambiarFicha(int origen, int destino) {
		
		casillas[origen] = false;
		casillas[destino] = true;
		
	}
	
	public int consultarNumCasillas() {
		
		return numCasillas;
		
	}
	
	public boolean[] consultarCasillas() {
		
		return casillas;
		
	}

}
