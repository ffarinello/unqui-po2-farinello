package ar.edu.unq.po2.tp3.ejercicio6;

import java.util.ArrayList;

public class Multioperador{
		
	public static void main(String[] args){
	
		ArrayList<Integer> arreglo = new ArrayList<>();
		
		arreglo.add(4);
		arreglo.add(3);
		arreglo.add(2);
	}
	
	public void sumarArreglo(ArrayList<Integer> lista) { 
		int suma = lista.get(0);
		
		for (int i = 1; i < lista.size(); i++) { 
			suma += lista.get(i); 
		} 
	}
	
	public void restarArreglo(ArrayList<Integer> lista) { 
		int resta = lista.get(0);
		
		for (int i = 1; i < lista.size(); i++) {
		    resta -= lista.get(i);
		}
	}
	
	public void multiplicarArreglo(ArrayList<Integer> lista) { 
		int producto = lista.get(0);
		
		for (int i = 1; i < lista.size(); i++) {
		    producto = producto * lista.get(i);
		}
	}
}