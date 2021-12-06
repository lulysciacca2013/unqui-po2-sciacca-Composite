package ar.edu.unqui.poo.Cultivos;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.plaf.synth.Region;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.ed.unq.poo.Cultivos.Cultivo;
import ar.ed.unq.poo.Cultivos.Mixto;
import ar.ed.unq.poo.Cultivos.Soja;
import ar.ed.unq.poo.Cultivos.Trigo;

public class CultivoTest {
	
	private Cultivo cultivo;
	private Mixto mixto;
	private Mixto mixto2;
	private Soja soja;
	private Trigo trigo;
	
	@BeforeEach
	public void setUP() throws Exception {
		trigo = new Trigo();
		soja = new Soja();
		mixto = new Mixto();
		mixto2 = new Mixto();
		
		mixto.agregarCultivo(soja);  
		mixto.agregarCultivo(soja);
		mixto.agregarCultivo(trigo);
		mixto.agregarCultivo(trigo);
		
		
		mixto2.agregarCultivo(soja);  
		mixto2.agregarCultivo(soja);
		mixto2.agregarCultivo(mixto);
		mixto2.agregarCultivo(trigo);
	}

	
	@Test
	public void testGananaciaAnualDeLaSoja() {
		assertEquals(soja.gananciaAnual(), 500);
	}
	
	@Test
	public void testGananciaAnualDelTrigo() {
		assertEquals(trigo.gananciaAnual(), 300);
	}
	
	@Test 
	public void testGananciaAnualDeLCultivoMixto() {
		assertEquals(mixto.gananciaAnual(), (1600/4) );
	}
	
	@Test
	public void testGananciaAnualDelCultivo() {
		assertEquals(mixto2.gananciaAnual(), 425);
	}
}
