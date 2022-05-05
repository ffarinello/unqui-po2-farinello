package ar.edu.unq.po2.tp3.ejercicio1;

import java.util.ArrayList;

public class Counter {
	
	public static void main(String[] args) {
		ArrayList<Integer> secuencia = new ArrayList<>();
	}
	
		// getter list
	public ArrayList<Integer> getSecuencia(){
		return this.getSecuencia();
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
				.filter(numero -> !divisiblePor(numero, 2))
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
	public boolean divisiblePor(int numero, int otroNumero) {
		return numero % otroNumero == 0;
	}

	public Counter addNumber(Integer numero) {
		this.getSecuencia().add(numero);
		return this;		
	}
}

