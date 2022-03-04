package examen.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import examen.model.Grupo;
import examen.model.Mensaje;
import examen.model.Persona;
import examen.model.Usuario;

public class Chat {
	
	private Map<Long, Mensaje> mensajes = new HashMap<Long, Mensaje>();
	private long id;
	private Persona creador;
	private Usuario usuarios;
	
	public Chat() {
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Map<Long, Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(Map<Long, Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public Persona getCreador() {
		return creador;
	}

	public void setCreador(Persona creador) {
		this.creador = creador;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Mensaje enviarMensaje(Persona origen, String mensaje) {
		if (usuarios.getClass().equals(Grupo.class)) {
			if (!((Grupo)usuarios).getPersonas().contains(origen)) {
				return null;
			}
		}
		Mensaje msj = new Mensaje();
		msj.setOrigen(origen);
		msj.setDestino(usuarios);
		Long idMensaje = new Random().nextLong();
		while (mensajes.containsKey(idMensaje)) {
			idMensaje = new Random().nextLong();
		}
		msj.setId(idMensaje);
		msj.setMensaje(mensaje);
		
		mensajes.put(idMensaje, msj);
		usuarios.notificar(msj);
		
		return msj;
	}
	
	
}
