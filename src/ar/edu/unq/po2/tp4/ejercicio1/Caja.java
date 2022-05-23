package ar.edu.unq.po2.tp4.ejercicio1;

import java.util.ArrayList;

public class Caja {
	
	ArrayList<Producto> listaDeProductos = new ArrayList<>();
	
	private float totalAPagar = 0;

		// Register a product and communicate its value to the customer.
	
	public void registrarProducto(Producto producto, Mercado mercado, Cliente cliente) {
		this.registrar(mercado, producto);
		this.informarSaldo(cliente);
	}
	
		//	Register a purchased product and communicate its to the market.
	
	public void registrar(Mercado mercado, Producto producto) {
		listaDeProductos.add(producto);
		totalAPagar += producto.getPrecio();
		mercado.decrementarStock(producto);
	}
	
		// Communicate the value of the product to the customer.
	
	private void informarSaldo(Cliente cliente) {
		cliente.saldoAPagar = totalAPagar;
	}

}