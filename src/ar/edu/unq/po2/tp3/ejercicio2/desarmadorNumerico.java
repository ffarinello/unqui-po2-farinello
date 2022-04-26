package ar.edu.unq.po2.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class desarmadorNumerico {
	
	/** recibe un arreglo de numeros enteros y devuelve 
	 *    el numero que mas digitos pares contenga. 
	*/
	
	private List<Integer> arreglo = new ArrayList<>();
	int numero = 0;
	int cantDePares = 0
	
	/* 
	 ESTRATEGIA 
	    * si es par, sumar
	    * dividir por 10 para correr la coma.	
	    * 
	*/
	
	public List<Integer> getArreglo(){
		// getter de lista
		return arreglo;
	}
	
	public boolean esPar(int numero) {
		// indica si el numero dado es par
		return numero % 2 == 0;
	}
	
	public int sumarSi(int numero, boolean condicion) {
		if(this.esPar(numero)) cantDePares += 1;
	}
	
	public void desarmar() {
		// elimina el último digito del numero dado, hasta llegar a 0.
		while (numero>0) {
			numero = numero/10;
		}
	}
}