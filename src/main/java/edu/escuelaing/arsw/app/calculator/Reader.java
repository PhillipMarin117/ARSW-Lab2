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

    public Reader() {

    }

    /**
     * Reads the file line per line adding each line (number) to a linkedList for
     * calcultes mean and standar deviation
     *
     * @param ruta File's path.
     * @throws java.io.IOException If the file's path is not found.
     */
    public String leerArchivo(String ruta) throws IOException {
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
            Double mean = calculator.calculateMean(lista);
            Double standarDeviation = calculator.calculateStandarDeviation(lista);
            System.out.println("The number's mean is: " + mean);
            System.out.println("The number's standar deviation is: " + standarDeviation);
            String result = "Mean: " + mean + " \nStandar deviation: " + standarDeviation;
            return result;
        } catch (IOException e) {
            throw new IOException("El archivo no existe", e);
        }

    }

    public static void main(String[] args) {
        Reader lector = new Reader();
        try {
            lector.leerArchivo(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
