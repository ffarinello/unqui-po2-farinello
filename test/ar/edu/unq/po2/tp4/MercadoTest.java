package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ejercicio1.Mercado;
import ar.edu.unq.po2.tp4.ejercicio1.Producto;

public class MercadoTest {
	
	private Mercado mercado;
	
	private Producto fideos;
	private Producto gaseosa;
	private Producto verdura;
	private Producto legumbre;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		mercado = new Mercado();
		mercado.agregaProducto(gaseosa);	
		mercado.agregaProducto(legumbre);
		mercado.agregaProducto(fideos);
		mercado.agregaProducto(verdura);
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}


}