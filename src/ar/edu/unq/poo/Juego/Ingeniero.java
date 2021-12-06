package ar.edu.unq.poo.Juego;

public class Ingeniero implements Personaje {

private int lajas;
	
	public Ingeniero(int lajas) {
		super();
		this.lajas = lajas;
	}

	
	@Override
	public void caminar(Punto punto) {
	
		this.dejarRastroLajas();
	}
	
	public void dejarRastroLajas() {  
		//ingeniero deja un rastro de lajas
	}
}
