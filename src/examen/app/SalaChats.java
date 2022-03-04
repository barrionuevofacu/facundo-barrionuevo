package examen.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import examen.model.Persona;
import examen.model.Usuario;

public class SalaChats {
	
	private Persona persona = new Persona();
	private Map<Long,Chat> chats = new HashMap<Long, Chat>();
	
	public SalaChats(){
		
	}
	
	public Persona getPersona() {
		return this.persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Chat getChat(Long id){
		return chats.get(id);
	}
	
	public Chat crearChat(Usuario usuarios) {
		Chat nuevoChat = new Chat();
		nuevoChat.setCreador(this.persona);
		nuevoChat.setUsuarios(usuarios);
		long idChat = new Random().nextLong();
		while (chats.containsKey(idChat)) {
			idChat = new Random().nextLong();
		}
		nuevoChat.setId(idChat);
		chats.put(idChat, nuevoChat);
		
		return nuevoChat;
	}
	
	public Chat getChatPorNombre(String nombre) {
		for (Map.Entry<Long, Chat> entry : chats.entrySet()) {
		    if (entry.getValue().getUsuarios().getNombre().equals(nombre))
		    	return entry.getValue();
		}
		return null;
	}
	
	public Chat getChatPorId(Long id) {
		return this.chats.get(id);
	}
}
