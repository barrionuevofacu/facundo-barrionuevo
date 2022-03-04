package examen.model;

public class Mensaje {
	private long id;
	private String mensaje;
	private Persona origen;
	private Usuario destino;
	
	public Mensaje() {
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Persona getOrigen() {
		return origen;
	}
	public void setOrigen(Persona origen) {
		this.origen = origen;
	}
	public Usuario getDestino() {
		return destino;
	}
	public void setDestino(Usuario destino) {
		this.destino = destino;
	}
}
