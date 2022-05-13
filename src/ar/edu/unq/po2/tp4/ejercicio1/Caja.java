package ar.edu.unq.po2.tp4.ejercicio1;

import java.util.ArrayList;

public class Caja {
	
	ArrayList<Producto> listaDeProductos = new ArrayList<>();
	
	private float totalAPagar = 0;

		// registra el producto y le informa al cliente lo que tiene que pagar.
	
	public void registrarProducto(Producto producto, Mercado mercado, Cliente cliente) {
		this.registrar(mercado, producto);
		this.informarSaldo(cliente);
	}
	
		//	registra el producto y le informa al mercado el producto comprado.
	
	public void registrar(Mercado mercado, Producto producto) {
		listaDeProductos.add(producto);
		totalAPagar += producto.getPrecio();
		mercado.decrementarStock(producto);
	}
	
		// informa el saldo a pagar al cliente.
	
	private void informarSaldo(Cliente cliente) {
		cliente.saldoAPagar = totalAPagar;
	}

}