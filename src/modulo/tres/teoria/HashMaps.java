package modulo.tres.teoria;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        Auto auto1 = new Auto("AAO3942", "Fiat Uno", "Marcelo");
        Auto auto2 = new Auto("WRY4589", "Nissan Sentra", "Florencia");
        Auto auto3 = new Auto ("MLD3320", "Chevrolet Equinox", "Romina");

        // Crear Hash Map
        HashMap<String, Auto> mapaAutos = new HashMap<String, Auto>();

        // put() --> Agregar elementos
        mapaAutos.put("AAO3942", auto1);
        mapaAutos.put("WRY4589", auto2);
        mapaAutos.put("MLD3320", auto3);

        // get() --> Obtener información
        System.out.printf("El modelo del auto de %s es: %s\n",
                mapaAutos.get("MLD3320").getTitular(),
                mapaAutos.get("MLD3320").getModelo()
        );

        // remove() --> Eliminar elementos
        mapaAutos.remove("AAO3942");

        // containsKey() --> devuelve true si se encuentra una entrada con dicha clave
        System.out.println("El auto con patente AAO3942 se encuentra en el mapa: " +
                mapaAutos.containsKey("AAO3942") // false
        );

        for (String key : mapaAutos.keySet()) {
            System.out.println(key + " - " + mapaAutos.get(key));
        }

        mapaAutos.clear();

        System.out.println(mapaAutos.isEmpty());
    }
}
