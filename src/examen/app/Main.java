package examen.app;

import examen.model.Grupo;
import examen.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona facu = new Persona();
		facu.setNombre("facu");
		facu.setNroTelefonico("2284535361");
		
		Persona juan = new Persona();
		juan.setNombre("juan");
		juan.setNroTelefonico("2284515161");
		
		Persona jose = new Persona();
		jose.setNombre("jose");
		jose.setNroTelefonico("2284535363");
		
		Grupo grupo = new Grupo();
		grupo.addPersona(facu);
		grupo.addPersona(juan);
		grupo.addPersona(jose);
		
		SalaChats chats = new SalaChats();
		chats.setPersona(facu);
		Chat nuevoChat = chats.crearChat(grupo);
		
		nuevoChat.enviarMensaje(facu, "Mensaje de prueba");
		
		System.out.println(juan.getNotificaciones().size()>0? juan.getNotificaciones().get(0).getMensaje() : "No hay mensajes nuevos");
		
	}

}
