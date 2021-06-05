package edu.escuelaing.arsw.app;


import edu.escuelaing.arsw.app.calculator.Calculator;
import edu.escuelaing.arsw.app.calculator.Reader;
import edu.escuelaing.arsw.app.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

	@Test
	public void deberiaRemoverDeUnaLista() {
		LinkedList lista = new LinkedList();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.remove();
		assertEquals(2,lista.size());
	}

	@Test
	public void deberiaRemoverDeUnaLista2() {
		LinkedList lista = new LinkedList();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.remove();
		assertNotEquals(3,lista.size());
	}

	@Test
	public void deberiaCalcularLaMedia() throws Exception {
		Calculator calculator = new Calculator();
		LinkedList lista = new LinkedList();
		lista.add(44.2);
		lista.add(4.5);
		lista.add(111.1);
		Double value = calculator.calMean(lista);
		assertEquals(53.27, value, 0);
	}

	@Test
	public void noDeberiaCalcularLaMedia() {
		Calculator calculator = new Calculator();
		LinkedList lista = new LinkedList();
		lista.add(55.55);
		lista.add(43.5);
		lista.add(11.1);
		lista.add(32);
		Double value = calculator.calMean(lista);
		assertNotEquals(35.99, value, 0);
	}

	@Test
	public void debriaCalcularLaDesviacionEstandar() throws Exception {
		Calculator calculator = new Calculator();
		LinkedList lista = new LinkedList();
		lista.add(44.2);
		lista.add(4.5);
		lista.add(111.1);
		Double value = calculator.calDesvStandar(lista);
		assertEquals(53.88, value, 0);
	}

	@Test
	public void noDebriaCalcularLaDesviacionEstandar() {
		Calculator calculator = new Calculator();
		LinkedList lista = new LinkedList();
		lista.add(44.2);
		lista.add(4.5);
		lista.add(111.1);
		Double value = calculator.calDesvStandar(lista);
		assertNotEquals(35.12, value, 0);
	}

	@Test
	public void debriaCalcularLaDesviacionYMediaDeUnArchivo() throws Exception {
		
		  Reader lector = new Reader();
		  String result = "media: "+550.6+" \n desviación estándar: "+572.03;
		  String rute = "test_files/1.txt";		 
		  String value = lector.leerArchivo(rute);
		  assertEquals(value,result);
	}
	
	@Test
	public void noDebriaCalcularLaDesviacionYMediaDeUnArchivo() throws Exception {
		  Reader lector = new Reader();
		  String result = "media: "+540.6+" \n desviación estándar: "+572.07;
		  String rute = "test_files/1.txt";		 
		  String value = lector.leerArchivo(rute);
		  assertNotEquals(value,result);		
	}

}
