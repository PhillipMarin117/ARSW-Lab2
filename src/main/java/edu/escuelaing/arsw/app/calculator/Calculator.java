package edu.escuelaing.arsw.app.calculator;

import edu.escuelaing.arsw.app.linkedList.LinkedList;

/**
 * Operaciones necesarias para calcular la media y la desviación estandar.
 * @author Felipe Marín
 */
public class Calculator {
    /**
     * Este metodo permite calcular la media de una lista
     * @param lista
     * @return double.
     */
    public Double CalMean (LinkedList lista){
        int size = lista.size();
        if (size <= 0) {
            return 0.0;
        }
        double suma = 0;
        for (int i = 0; i < size; i++) {
            suma += lista.get(i).getDatos();
        }
        return (double) Math.round((suma / size) * 100) / 100;
    }

    /**
    * Este metodo permite calcular la Desviacion de una lista
    * @param lista // este es de tipo LinkedList
    * @return double desviacion estandar
    */

    public Double CalDesviation(LinkedList lista){
        int size = lista.size();
        if (size < 2) {
            return 0.0;
        }
        else{
            double valor = 0;
            double media = CalMean(lista);
            for (int i=0 ; i <size; i++){
                valor = valor + Math.pow((lista.get(i).getDatos()-media), 2);
            }
            double desvStandar = Math.sqrt(valor / (size-1));
            return (double) Math.round(desvStandar * 100)/100;
            }
        }
}

