package ar.unq.edu.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.ejercicio1.Counter;

public class CounterTestCase {
	private Counter counter;

/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
@BeforeEach
public void setUp() throws Exception {
//Se crea el contador
counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
counter.addNumber(1);
counter.addNumber(3);
counter.addNumber(5);
counter.addNumber(7);
counter.addNumber(9);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(4);
}

/**
* Verifica la cantidad de pares
*/

	@Test
	public void testCantidadDePares() {
		// Cuenta todos los números pares encontrados.
	int amount = counter.contarPares();		
		// I check the amount is the expected one
	assertEquals(amount, 1);
	}

/**
* Verifica la cantidad de impares
*/

	@Test
	public void testCantidadDeImpares() {
		// Cuenta todos los números impares encontrados.
	int amount = counter.contarImpares();		
		// I check the amount is the expected one
	assertEquals(amount, 9);
	}

	/**
* Verifica la cantidad de multiplos de 4
*/
	
	@Test
	public void testCantidadDeMultiplos() {
		// Getting the even occurrences
	Integer amount = counter.contarMultiplos(4);		
		// I check the amount is the expected one
	assertEquals(amount, 1);
	}
}