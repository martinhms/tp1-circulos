package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
Circulo circulo = new Circulo(2.0);
Double valorRadioEsperado=2.0;
		Double 
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		fail("Not yet implemented");
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		fail("Not yet implemented");
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		fail("Not yet implemented");
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		fail("Not yet implemented");
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		fail("Not yet implemented");
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
