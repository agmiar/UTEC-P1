package modulo.cuatro.teoria;

// https://www.youtube.com/watch?v=ScUJx4aWRi0

import java.io.*;

// Absolute path = "C:\[...]"
// Relative path = "./output.txt"

public class InputOutput {
    public static void main(String[] args) throws IOException {
        // Escribir archivos
        // new FileWriter le dice al BufferedWritter a qué tipo de archivo quiero escribir

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("./output.txt"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        writer.write("Hola mundo!");

        writer.close(); // Siempre tengo que cerrar el writer, sino no se crea el archivo

        // ---------------------------------------------------------

        // Leer archivos
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("modulo/cuatro/io/familia.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String linea;

        // primero ejecuta la lectura, luego la asignación y por último compara
        while((linea = reader.readLine()) != null){
            System.out.println(linea);
            // puedo ayudarme del método split() del tipo de dato String para separar la información mediante comas, etc.
        }

        reader.close();
    }
}
