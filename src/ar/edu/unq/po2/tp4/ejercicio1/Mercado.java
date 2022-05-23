package ar.edu.unq.po2.tp4.ejercicio1;

import java.util.ArrayList;

public class Mercado {
	
	ArrayList<Producto> mercado = new ArrayList<>();
	
	public void agregaProducto(Producto producto) {
		mercado.add(producto);
	}
	
		// discount the product for the stock market.
	public void decrementarStock(Producto producto) {
		mercado.remove(producto);
	}
	
	
}