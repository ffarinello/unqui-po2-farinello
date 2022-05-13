package ar.edu.unq.po2.tp4.ejercicio1;

import java.util.ArrayList;

public class Caja {
	
	ArrayList<Producto> listaDeProductos = new ArrayList<>();
	
	private float totalAPagar = 0;

	public void registrarProducto(Producto producto, Mercado mercado, Cliente cliente) {
			/* Registrar un producto implica: 
					* registrarlo en la nuevaCompra
					* descontar el producto del stock del mercado
					* 
			*/
		this.registrar(mercado, producto);
		this.informarSaldo(cliente);
		/*
		mercado.descontarProducto(producto);
		cliente.setSaldoAPagar(producto);
		*/
	}
	
	public void registrar(Mercado mercado, Producto producto) {
		listaDeProductos.add(producto);
		totalAPagar += producto.getPrecio();
		mercado.decrementarStock(producto);
	}
	
	private void informarSaldo(Cliente cliente) {
		cliente.saldoAPagar = totalAPagar;
	}

}