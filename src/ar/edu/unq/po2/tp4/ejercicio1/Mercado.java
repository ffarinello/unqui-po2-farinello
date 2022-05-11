package unqui.po2.tp4;

import java.util.ArrayList;

public class Mercado {
	
	ArrayList<Producto> stock = new ArrayList<>();
	
	public ArrayList<Producto> getStock() {
		return stock;
	}
	
	public void descontarProducto(Producto producto) {
			// descuenta el producto del stock del mercado.
		stock.remove(producto);
	}
}