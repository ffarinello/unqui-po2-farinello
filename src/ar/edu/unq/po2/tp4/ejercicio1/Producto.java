package unqui.po2.tp4;

import unqui.po2.tp4.Producto;

public class Producto {
	
	public double precioBase;
	
	public void setPrecio(float precio){
		precioBase = precio;
	}
	
	public double getPrecio() {
		return precioBase;
	}
}

public class ProductoTradicional extends Producto{
	
	private double iva = 1.10;

	public double impuestoIVA() {
		return precioBase * 0.10;
	}
}
public class ProductoCooperativo extends Producto{}