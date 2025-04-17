package modulo.uno.practico;

public class Code {

    public static int invertirNumero(int n){
        int invertido = 0;
        for (int i = 1; n != 0; i++){
            invertido = invertido * 10 + n % 10;
            n = n / 10;
        }
        return invertido;
    }

    public static boolean esPrimo(int n){
        int contador = 2;
        while (contador < Math.sqrt(n)){
            if (n % contador == 0){
                break;
            } else
                contador++;
        }
        return (contador > Math.sqrt(n));
    }

    public static void main(String[] args) {
        int valor = 1234;
        System.out.println(invertirNumero(valor));

        System.out.println(esPrimo(valor));
    }
}

