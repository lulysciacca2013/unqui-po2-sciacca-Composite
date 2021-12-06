package ar.edu.unq.poo.Juego;

import java.util.List;

public class Ejercito implements Personaje {

	List<Personaje> personajes;

	public Ejercito(List<Personaje> personajes) {
		super();
		this.personajes = personajes;
	}

	@Override
	public void caminar(Punto punto) {
		
		personajes.stream().forEach(p -> p.caminar(punto));
		
	}
	
	public void agregarPersonaje(Personaje personaje) {
		this.personajes.add(personaje);
	}
	
	public void eliminarPersonaje(Personaje personaje) {
		this.personajes.remove(personaje);
	}
	
	
}
