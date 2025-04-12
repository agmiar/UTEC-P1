package modulo.uno.practico;

import java.util.Scanner;

public class Iteraciones {
//    Ejercicio 1:
//    Escribe un programa que compare dos números ingresados por el usuario e imprima el
//    mensaje "El primer número es mayor" o "El segundo número es mayor" según sea el caso.
    //    Si son iguales, imprime "Ambos números son iguales".

    public static void determinarMayorDeDosNumeros(int x, int y){
        if(y > x) System.out.printf("El segundo número (%d) es mayor que %d \n", y, x);
        else if (x > y) System.out.printf("El primer número (%d) es mayor que %d \n", x, y);
        else System.out.println("Ambos números son iguales");
    }
//    Ejercicio 2
//    Crea un programa que solicite al usuario ingresar un número entero. Luego, determina si
//    ese número es par o impar e imprime el resultado.
    public static int solicitarNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        return scanner.nextInt();
    }

    public static void esPar(int x){
        if (x % 2 == 0) System.out.printf("%d es par.", x);
        else System.out.printf("%d es impar.", x);
    }

//    Ejercicio 3
//    Pide al usuario que ingrese un número. Luego, verifica si el número está en el rango de 1 a
//100 (inclusive). Imprime un mensaje indicando si el número está en el rango o no

    public static void estaEnRango(int x, int pisoRango, int techoRango){
        if (pisoRango <= x && x <= techoRango)
            System.out.printf("%d está en el rango de %d a %d. \n", x, pisoRango, techoRango);
        else System.out.printf("%d no está en el rango de %d a %d \n", x, pisoRango, techoRango);
    }

//    Ejercicio 4
//    Escribe un programa que solicite al usuario ingresar un número entero positivo. Luego,
//    utiliza un bucle (for o while) para sumar todos los números desde 1 hasta ese número e
//    imprime la suma.

    public static int calcularSumaEnRango(int num){
        int suma = 0;
        int contador = 1;
        while (contador <= num){
            suma += contador;
            contador++;
        }
        return suma;
    }

//            Ejercicio 5
//    Crea un programa que pida al usuario ingresar un número. Utiliza un bucle (for o while) para
//    calcular y mostrar el factorial de ese número.

    // Se podría mejorar cambiando el tipo de dato (int solo soporta hasta el factorial de 10, 11 aprox.)
    public static int calcularFactorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

//    Ejercicio 6
//    Desarrolla un programa que solicite al usuario ingresar un número. Utiliza un bucle (for o
//while) para determinar si el número es primo o no. Imprime el resultado.

    public static boolean esPrimo(int num){
        int aux = 2;
        while ((num % aux != 0) && (aux < Math.sqrt(num))){
            aux++;
        }
        return (aux > Math.sqrt(num));
    }

//            Ejercicio 7
//    Pide al usuario ingresar una cadena de caracteres. Luego, utiliza un bucle (for o while) para
//    imprimir la cadena en orden inverso.

    public static String solicitarString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres: ");
        return scanner.nextLine();
    }

    public static String invertirString(String cadena){
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

//    Ejercicio 8
//    Implementa un juego simple de adivinanzas. Elige un número secreto y permite que el
//    usuario intente adivinarlo. Proporciona pistas (mayor o menor) y utiliza un bucle (for o while)
//    para repetir hasta que el usuario adivine correctamente.

    public static void juegoDeAzar(int numeroSecreto){
        boolean acierto = false;
        int numeroSolicitado = 0;
        while (!acierto){
            numeroSolicitado = solicitarNumero();
            if (numeroSolicitado > numeroSecreto)
                System.out.println("El número ingresado es mayor que el secreto");
            else if (numeroSolicitado < numeroSecreto)
                System.out.println("El número ingresado es menor que el secreto");
            else
                acierto = true;
        }
        if (acierto == true) System.out.println("Acertaste!!");
    }

//-------------------------------------------------------------------

    public static void main(String[] args) {
        Iteraciones.determinarMayorDeDosNumeros(1,2);
        Iteraciones.determinarMayorDeDosNumeros(-9,4);
        Iteraciones.determinarMayorDeDosNumeros(5,5);
        System.out.println("\n-----------------------------------\n");

        Iteraciones.esPar(solicitarNumero());
        System.out.println("\n-----------------------------------\n");

        Iteraciones.estaEnRango(solicitarNumero(),1,100);
        Iteraciones.estaEnRango(solicitarNumero(),1,100);
        Iteraciones.estaEnRango(solicitarNumero(),1,100);
        System.out.println("\n-----------------------------------\n");

        System.out.println("La suma de los números es: " + Iteraciones.calcularSumaEnRango(solicitarNumero()));
        System.out.println("La suma de los números es: " + Iteraciones.calcularSumaEnRango(solicitarNumero()));
        System.out.println("\n-----------------------------------\n");

        System.out.println("El factorial del número es: " + Iteraciones.calcularFactorial(solicitarNumero()));
        System.out.println("El factorial del número es: " + Iteraciones.calcularFactorial(solicitarNumero()));
        System.out.println("\n-----------------------------------\n");

        System.out.println("es primo?: " + Iteraciones.esPrimo(solicitarNumero()));
        System.out.println("es primo: " + Iteraciones.esPrimo(solicitarNumero()));
        System.out.println("\n-----------------------------------\n");

        System.out.println("La string invertida es: " + Iteraciones.invertirString(solicitarString()));
        System.out.println("La string invertida es: " + Iteraciones.invertirString(solicitarString()));
        System.out.println("\n-----------------------------------\n");

        int numeroAlAzar = 8;
        juegoDeAzar(numeroAlAzar);
    }
}