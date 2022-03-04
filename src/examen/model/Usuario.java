package examen.model;

public abstract class Usuario {
	private String nombre;
	
	public Usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void notificar(Mensaje msj);
}
