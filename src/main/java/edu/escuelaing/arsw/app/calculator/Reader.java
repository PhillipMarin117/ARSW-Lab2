package edu.escuelaing.arsw.app.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import edu.escuelaing.arsw.app.linkedList.LinkedList;

/**
 * Lee los archivos ingresados por el usuario e imprime la media y desviación estandar. (La lectura se hace por columnas).
 * @author Felipe
 */
public class Reader {

	public Reader() {}
	public static void main(String[] args) {
		Reader lector = new Reader();
		try {
			lector.leerArchivo(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 *Lee la línea del archivo por línea agregando cada línea (número) a una
	 * lista vinculada para * calcula la desviación estándar y media
	 * @param ruta File's path.
	 * @throws java.io.IOException If the file's path is not found.
	 */
	public String leerArchivo(String ruta) throws IOException {
		//Varias de las siguiente lineas de codigo fueron tomadas de un proyecto como ejemplo
		Charset charset = Charset.forName("UTF-8");
		Path archivo = Paths.get(ruta);
		LinkedList lista = new LinkedList(); // Como solo tenemos una funcionalidad se crea el objeto
		try (BufferedReader lector = Files.newBufferedReader(archivo, charset)) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				Double element = Double.parseDouble(linea);
				lista.add(element);
			}
			Calculator calculator = new Calculator();
			Double Media = calculator.calMean(lista);
			Double Desviacion = calculator.calDesvStandar(lista);
			System.out.println("La desviación estándar del número es: " + Desviacion);
			System.out.println("La media del numero es: " + Media);
			String result = "media: " + Media + " \n desviación estándar: " + Desviacion;
			return result;
		}
		catch (IOException e) {
			throw new IOException("El archivo no existe", e);
		}
	}
}