package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String ubicacion;
	
	public Supermercado(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	ArrayList<Producto> cantidadDeProductos= new ArrayList<>();
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos.size();
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos.add(producto);
	}
	
	public double getPrecioTotal() {
		double precioTotal = cantidadDeProductos.stream()
							 .mapToDouble(producto -> producto.getPrecio()).sum();
		return precioTotal;
	}
}