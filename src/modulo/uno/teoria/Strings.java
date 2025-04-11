package modulo.uno.teoria;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "hola";
        if(str1.equals(str2)){
            System.out.println("Son iguales!");
        } else {
            System.out.println("No son iguales =(");
        }

        int nota = 10;
        String juicio;
        switch(nota){
            case 5, 6:
                juicio = "Aceptable";
                break;
            case 7, 8:
                juicio = "Muy bueno";
                break;
            case 9, 10:
                juicio = "Excelente";
                break;
            default:
                juicio = "";
                break;
        }
        System.out.println(nota + " " + juicio);
    }
    }

