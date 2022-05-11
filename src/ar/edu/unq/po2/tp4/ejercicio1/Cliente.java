package unqui.po2.tp4;

import java.util.ArrayList;

public class Cliente {
	
	ArrayList<Producto> nuevaCompra = new ArrayList<>();
	private float saldoAPagar;
	
	public float getSaldoAPagar() {
		return saldoAPagar;
	}

	public void setSaldoAPagar(Producto producto) {
		saldoAPagar =+ producto.getPrecio();
	}

	public ArrayList<Producto> getNuevaCompra() {
		return nuevaCompra;
	}

	public void comprarProducto(Producto producto) {
			//agrega un producto a la lista de compra.
		nuevaCompra.add(producto);
	}

//	public void incrementarSaldo(Producto producto) {
//		saldoAPagar += producto.getPrecio();
//	}
}
