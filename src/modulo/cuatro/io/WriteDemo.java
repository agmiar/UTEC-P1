package modulo.cuatro.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) {
        try{
            File archivo = new File("./modulo/cuatro/io/archivo.txt");
            if (archivo.exists()){
                PrintWriter myPrintWriter = new PrintWriter(new FileWriter(archivo, true));
                myPrintWriter.println("Escribiendo el archivo");
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
