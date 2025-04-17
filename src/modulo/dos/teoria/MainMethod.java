package modulo.dos.teoria;

public class MainMethod {
    public static void main(String[] args) {
        if (args[0].equals("1"))
                System.out.println("El primer argumento es: 1");
        else if (args[1].equals("2"))
            System.out.println("El segundo argumento es: 2");
        else
            System.out.println("No se ha ingresado un argumento válido");
    }
}
