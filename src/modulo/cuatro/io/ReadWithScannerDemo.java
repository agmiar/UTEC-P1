package modulo.cuatro.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWithScannerDemo {
    public static void main(String[] args) {
        File archivo = new File("src\\modulo\\cuatro\\io\\familia.txt");

        ArrayList<Persona> personas = new ArrayList<>();

        try {
            Scanner myScanner = new Scanner(archivo);

            while (myScanner.hasNext()){

                // Leer la línea completa
                String linea = myScanner.nextLine();
                // Separar los argumentos de cada línea
                String[] lineaSeparada = linea.split(",");
                // Eliminar todos los espacios en blanco al inicio
                // y al final de cada string de la línea separada
                for (int i = 0; i < lineaSeparada.length; i++)
                    lineaSeparada[i] = lineaSeparada[i].trim();

                Persona persona = new Persona(lineaSeparada[0],
                        Integer.parseInt(lineaSeparada[1]),
                        lineaSeparada[2]);

                personas.add(persona);
            }

            myScanner.close();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        for(Persona persona: personas){
            System.out.println(persona.toString());
        }
    }
}
