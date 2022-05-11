package unqui.po2.tp4;

import java.util.ArrayList;

public class Caja {
	
	ArrayList<Producto> stock = new ArrayList<>();
	
	private float totalAPagar = 0;
	
	public void registrarProducto(Producto producto, Mercado mercado, Cliente cliente) {
			/* Registrar un producto implica: 
					* registrarlo en la nuevaCompra
					* descontar el producto del stock del mercado
					* 
			*/
		this.registrar(producto);
		mercado.descontarProducto(producto);
		cliente.setSaldoAPagar(producto);
	}
	
	
	public void registrar(Producto producto) {
		totalAPagar += producto.getPrecio();
	}
}