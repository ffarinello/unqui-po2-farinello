package ar.edu.unq.po2.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class desarmadorNumerico {
	/** recibe un arreglo de numeros enteros y devuelve 
	 *    el numero que mas digitos pares contenga. 
	 */
	
	private List<Integer> arreglo = new ArrayList<>();
	
	public List<Integer> getArreglo(){
		// getter de lista
		return arreglo;
	}
	
	public Integer encontrarElMaximoEnPares(List<Integer> arreglo) {
			//Retorna el numero que mas digitos pares tenga.
		
		Integer maximoActual = arreglo.get(0);
	 //TODO: ...
	}
	
	
	
	public void sumarSi(int numero) {
		
		if(this.esPar(numero)) {this.getContadorDePares() +
			1} else {this.getContadorDePares() + 0};
	}
	
	public boolean esPar(int numero) {
		// indica si el numero dado es par
		return numero % 2 == 0;
	}
	
	public boolean desarmar(int numero) {
		// retorna true si puede eliminar el ultimo digito del numero dado.
		if (numero>0) {
			numero = numero/10; 
			return true;
		} else
			return false;
	}
}