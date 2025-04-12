package modulo.uno.practico;

public class Condicionales {
    // Ejercicio 1:
//        Escriba un programa Java que determine si un número es positivo, negativo o cero.

    public static String signoNumero(int i){
        String signo = "cero";
        if (i > 0) signo = "positivo";
        else if (i < 0) signo = "negativo";
        return signo;
    }

    //        Ejercicio 2:
//        Escribe un programa Java que determine si un año es bisiesto o no. Un año es bisiesto si es
//        divisible por 4, excepto aquellos que son divisibles por 100 pero no por 400.

    public static boolean esBisiesto(int anio){
        boolean esBisiesto = false;
        if (((anio % 4 == 0) && (anio % 100 != 0)) ||
                ((anio % 4 == 0) && (anio % 100 == 0) && (anio % 400 == 0)))
            esBisiesto = true;
        return esBisiesto;
    }

    //        Ejercicio 3:
//        Escribe un programa Java que determine la mayor de tres variables.

    public static int determinarMayorDeTres(int x, int y, int z){
        int mayor = (y > x) ? y : x;
        mayor = mayor > z ? mayor : z;
        return mayor;
    }

    //                Ejercicio 4:
//        Escribe un programa Java que, dado un día de la semana (1 al 7), imprima el nombre del
//        día correspondiente.
    public static String diaDeLaSemana(int dia){
        String diaSemana = "";
        switch (dia){
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
        }
        return diaSemana;
    }

    //        Ejercicio 5:
//        Escribe un programa Java que determine si una letra es vocal o consonante

    public static boolean esVocal(char letra){
       // Asumo que la letra es consonante
        boolean esVocal = false;
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') esVocal = true;
        return esVocal;
    }

    public static void main(String[] args) {
        System.out.println("el signo de 2 es: " + Condicionales.signoNumero(2));
        System.out.println("el año 2012 es bisiesto?: " + Condicionales.esBisiesto(2012));
        System.out.println("este año es bisiesto?: " + Condicionales.esBisiesto(2025));
        System.out.println("el mayor de 1,2,3 es: " + Condicionales.determinarMayorDeTres(1,2,3));
        System.out.println("el mayor de -1,-2,-3 es: " + Condicionales.determinarMayorDeTres(-1,-2,-3));
        System.out.println("el segundo día de la semana es: " + Condicionales.diaDeLaSemana(2));
        System.out.println("la letra D es vocal?: " + Condicionales.esVocal('D'));
        System.out.println("la letra U es vocal?: " + Condicionales.esVocal('U'));
    }
}

