package examen.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Usuario{

	private List<Persona> personas;
	private int notificaciones;
	
	public Grupo() {
		super();
		personas = new ArrayList<>();
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public void addPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public void addPersonas(List<Persona> personas) {
		this.personas.addAll(personas);
	}
	
	public int getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(int notificaciones) {
		this.notificaciones = notificaciones;
	}

	@Override
	public void notificar(Mensaje msj) {
		for (Persona p : personas) {
			if (msj.getOrigen().getNroTelefonico() != null && p.getNroTelefonico() != null &&
					!msj.getOrigen().getNroTelefonico().equals(p.getNroTelefonico())){
				p.notificar(msj);
			}
		}
	}
	
}
