package examen.model;

import java.util.ArrayList;
import java.util.List;

public class Persona extends Usuario {
	
	private String nroTelefonico;
	private boolean isContacto;
	private List<Mensaje> notificaciones = new ArrayList<Mensaje>();

	public Persona() {
		super();
	}

	public String getNroTelefonico() {
		return nroTelefonico;
	}
	public void setNroTelefonico(String nroTelefonico) {
		this.nroTelefonico = nroTelefonico;
	}
	public boolean isContacto() {
		return isContacto;
	}
	public void setContacto(boolean isContacto) {
		this.isContacto = isContacto;
	}

	public List<Mensaje> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Mensaje> notificaciones) {
		this.notificaciones = notificaciones;
	}
	
	public void leerNotificacion(Mensaje msj) {
		this.notificaciones.remove(this.notificaciones.stream().filter(notif -> notif == msj).findFirst().get());
	}
	
	@Override
	public void notificar(Mensaje msj) {
		notificaciones.add(msj);
	}
}
