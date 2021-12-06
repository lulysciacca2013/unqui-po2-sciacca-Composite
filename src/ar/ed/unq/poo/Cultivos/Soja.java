package ar.ed.unq.poo.Cultivos;

public class Soja implements Cultivo {
	
	private int gananciaAnual = 500;
	
	public Soja() {
		super();
	}
		


		@Override
		public double gananciaAnual() {
			return gananciaAnual;
		}
}
