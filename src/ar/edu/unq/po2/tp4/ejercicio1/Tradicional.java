package ar.edu.unq.po2.tp4.ejercicio1;

public class Tradicional extends Producto{

	@Override
	public double getPrecio() {
		
			double impuestoIVA = 1.10;
			
		return precioBase * impuestoIVA;
	}
}
