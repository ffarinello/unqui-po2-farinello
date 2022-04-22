package ar.edu.unq.po2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
		private List<Integer> secuencia = new ArrayList<>();
	
		// getter list
	public List<Integer> getSecuencia(){
		return this.secuencia;
	}
		
		/*
		 * Contar la cantidad de numeros pares de la secuencia
		 */
	public int contarPares(){
		return (int) this.getSecuencia().stream()
				.filter(numero -> numero % 2 == 0)//.divisiblePor(, 2))
				.count();
	}
		/*
		 * contar la cantidad de numeros IMPARES de la secuencia
		 */
	public int contarImpares(){
		return (int) this.getSecuencia().stream()
				.filter(numero -> !numero.divisiblePor(numero, 2))
				.count();
	}
		/*
		 * contar la cantidad de múltiplos del número dado
		 */
	public int contarMultiplos(Integer otroNumero){
		return (int) this.getSecuencia().stream()
				.filter(numero -> divisiblePor(numero, otroNumero))
				.count();
	}
		/*
		 * indicar si los números dados son múltiplos
		 */
	public boolean divisiblePor(Integer numero, int otroNumero) {
		return numero % otroNumero == 0;
	}

	public Counter addNumber(Integer numero) {
		this.secuencia.add(numero);
		return this;		
	}
}

