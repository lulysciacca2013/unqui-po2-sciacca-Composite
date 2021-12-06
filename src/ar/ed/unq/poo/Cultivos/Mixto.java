package ar.ed.unq.poo.Cultivos;

import java.util.ArrayList;
import java.util.List;

public class Mixto implements Cultivo{

	private List<Cultivo> cultivos;
	
	public Mixto() {
		super();
		this.cultivos = new ArrayList<Cultivo>();
	}
	
	

	
	public List<Cultivo> getCultivos() {
		return cultivos;
	}

	public void agregarCultivo(Cultivo cultivo) {
		if(this.getCultivos().size() <= 3) {
			this.getCultivos().add(cultivo);
		}
		
	}
	
	public void removerCultivo(Cultivo cultivo) {
		
		this.getCultivos().remove(cultivo);
	}

	@Override
	public double gananciaAnual() {
		int gananciaTotal = 0;
		for (Cultivo cultivo : this.getCultivos()) {
	       gananciaTotal += cultivo.gananciaAnual();
	        }
		 return gananciaTotal / this.getCultivos().size();
	}
	}

