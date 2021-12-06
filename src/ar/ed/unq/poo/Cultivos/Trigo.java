package ar.ed.unq.poo.Cultivos;

public class Trigo implements Cultivo {
	private int gananciaAnual = 300;

	public Trigo() {
		super();
		}
			


	@Override
	public double gananciaAnual() {
		return gananciaAnual;
	}
}