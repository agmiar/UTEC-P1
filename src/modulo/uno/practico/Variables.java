package modulo.uno.practico;

public class Variables {
public static void main(String[] args) {
    //    Ejercicio 1:
    //    Declara una variable de tipo entero llamada "edad" y asígnale el valor 25. Luego, imprime la
    //    variable en la consola.
    int edad = 25;
    System.out.println(edad);

//    Ejercicio 2:
//    Declara dos variables de tipo cadena llamadas "nombre" y "apellido", y asígnales tus
//    propios valores. Luego, concatena ambas variables y muestra el resultado en la consola.
    String nombre = "Armando";
    String apellido = new String("Casas");
    System.out.println(nombre + " " + apellido);

//    Ejercicio 3:
//    Realiza una serie de asignaciones de variables siguiendo la secuencia dada:
//            - a=5
//            - b=8
//            - c=a+b
//            - a=c+2
    int a = 5;
    int b = 8;
    int c = a + b;
    a = c + 2;
    System.out.printf("a: %d\n b: %d\n c: %d\n", a, b, c);

//    Ejercicio 4:
//    Declara una variable booleana llamada "esMayorEdad" y asígnale el valor verdadero si la
//    edad es mayor o igual a 18; de lo contrario, asigna falso. Imprime el resultado.
    boolean esMayorEdad = (edad >= 18) ? true : false;
    System.out.println("esMayorEdad: " + esMayorEdad);            ;

//            Ejercicio 5:
//    Realiza las siguientes asignaciones de variables:
//            - x = 10
//            - y = 5
//            - z = x + y
//            - x = z * 2
//    Imprime los valores de las variables al finalizar
    int x = 10;
    int y = 5;
    int z = x + y;
    x = z * 2;
    System.out.printf("x: %d\n y: %d\n z: %d\n", x, y, z);
}
}
