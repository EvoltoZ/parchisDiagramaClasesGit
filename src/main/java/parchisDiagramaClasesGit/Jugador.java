/**
 * 
 */
package parchisDiagramaClasesGit;

/**
 * 
 */

public class Jugador {
    private String nombre;
    private Tablero tablero;
    private Ficha[] fichas;
    private Usuario usuario;

    public Jugador(String nombre, Tablero tablero, Usuario usuario) {
        this.nombre = nombre;
        this.tablero = tablero;
        this.usuario = usuario;
        this.fichas = new Ficha[]{new Ficha(), new Ficha()};
    }

    // Actualizar métodos para manejar múltiples fichas...
}


	
	public void tirarDado(Dado d) {
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) {
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() {
		
		int[] casillas = tablero.consultarCasillas(); //
		
		int posicion = 0;
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) {
			
			if (casillas[i]==true) {
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public void moverFicha(int cs) {
		
		ficha.mover(cs);
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
