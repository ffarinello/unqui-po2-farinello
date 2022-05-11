package ar.unq.edu.ar.po2.tp3.ejercicio10;

public class Persona {
	String nombre;
	String fechaDeNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean menorQue(Persona persona) {
		return fechaDeNacimiento > persona.fechaDeNacimiento;
	}
	
}
