package modulo.cuatro.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ReadWithStreamsDemo {
    public static void main(String[] args) {
        Path filePath = Path.of("src\\modulo\\cuatro\\io\\familia.txt"); // Ruta del archivo

        ArrayList<String> personas = new ArrayList<>();

        try (Stream<String> lines = Files.lines(filePath)) {
            lines
                    .map(String::trim) // Elimina espacios en blanco al principio y al final de cada línea
                    .filter(line -> !line.isEmpty()) // Ignora líneas vacías
                    .forEach(personas::add);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        for(String persona: personas){
            System.out.println(persona);
        }
    }
}
