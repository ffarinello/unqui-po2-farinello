package ar.edu.unq.po2.tp3;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;

public class Counter {
	
		private ArrayList<Integer> secuencia = new ArrayList<Integer>();

	public Stream<Object> cantidadPares(int numero){
		return secuencia.stream().map(number -> divisiblePor(numero, 2));
	}

	public Stream<Object> cantidadImpares(int numero){
		return secuencia.stream().map(number -> !divisiblePor(numero, 2));
	}

	public Stream<Object> cantidadDeMultiplos(int numero, int otroNumero){
		return secuencia.stream().map(number -> divisiblePor(numero, otroNumero));
	}

	public static boolean divisiblePor(int numero, int otroNumero) {
		return numero % otroNumero == 0;
	}
}