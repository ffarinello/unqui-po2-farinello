package ar.edu.unq.po2.tp3.ejercicio3;

public class Multiplos {
	
	public int multiploMayorEntre(int x, int y) {
		// devuelva el número más alto entre 0 y 1000, que sea múltiplo simultáneamente de X e Y, sino 999.
		
		int maximoActual = 1000;
		
		while (this.sonMultiplos(maximoActual, x, y)) {
			maximoActual = maximoActual - 1;
			}
			return this.resultado(maximoActual);
		}
	
	public int resultado(int numero) {
		
	      if(numero>0)
	    	  return numero; 
	      else 
	    	  return 999;
	}

	public boolean sonMultiplos(int numeroAComparar, int numero, int otroNumero) {
		return this.esMultiploDe(numeroAComparar, numero) & 
			   this.esMultiploDe(numeroAComparar, otroNumero);
	}
	
	public boolean esMultiploDe(int numero, int otroNumero) {
		return numero % otroNumero == 0;
	}
}