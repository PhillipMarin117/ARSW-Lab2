package edu.escuelaing.arsw.app.calculator;

import edu.escuelaing.arsw.app.linkedList.LinkedList;

/**
 * Operaciones necesarias para calcular la media y la desviación estandar.
 * @author Felipe Marín
 */
public class Calculator {
    /**
     * Este metodo permite calcular la media de una lista
     * @param e //este es de tipo LinkedList
     * @return double.
     */
    public Double CalMean (LinkedList<Double> e){
        Double mean;
        double c = 0;
        for(Double data :e){
            c+=data;
        }
        mean = c /e.size();
        return mean;
    }
    /**
    * Este metodo permite calcular la Desviacion de una lista
    * @param e// este es de tipo LinkedList
    * @return double
    */

    public Double CalDesviation(LinkedList<Double> e){
        Double desviation;
        double c = 0;
        double mean = CalMean(e);
        for (Double data : e){
            c+=Math.pow((data-mean),2);
        }
        desviation = Math.sqrt((c/(e.size()-1)));
        return desviation;
    }
}
