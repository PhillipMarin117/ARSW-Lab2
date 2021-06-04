package edu.escuelaing.arsw.app.calculator;

import java.io.File;
import edu.escuelaing.arsw.app.calculator.Reader;

public class Main {
    public static void main(String[] args) {
        Reader a = new Reader();
        File file = new File(args[0]);
        Reader.readFile(file);
    }
}
