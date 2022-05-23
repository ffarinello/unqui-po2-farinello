package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	private String nombre;
			double precio;
	private boolean esPrecioCuidado;

	
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto (String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}
}
