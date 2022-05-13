package ar.edu.unq.po2.tp4.ejercicio1;

import java.util.ArrayList;

public class Mercado {
	
	ArrayList<Producto> stock = new ArrayList<>();
	
		// descuenta el producto del stock del mercado.
	public void decrementarStock(Producto producto) {
		stock.remove(producto);
	}
	
}