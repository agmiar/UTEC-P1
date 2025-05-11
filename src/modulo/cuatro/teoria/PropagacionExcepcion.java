package modulo.cuatro.teoria;

public class PropagacionExcepcion {

    public static void nivelTres() {
        // Acá se lanza una excepción
        throw new ArithmeticException("Error en nivelTres");
    }

    public static void nivelDos() {
        // No se atrapa la excepción, solo se propaga
        nivelTres();
    }

    public static void nivelUno() {
        // No se atrapa la excepción, solo se propaga
        nivelDos();
    }

    public static void main(String[] args) {
        try {
            nivelUno();
        }
        catch (ArithmeticException ex) {
            System.out.println("Excepción capturada en main: "
                    + ex.getMessage());

            StackTraceElement[] stackTraceElements = ex.getStackTrace();
            for (StackTraceElement elementoST: stackTraceElements) {
                System.out.printf("Método: " +
                        elementoST.getMethodName() + " - " +
                        elementoST.getClassName() + ": línea " +
                        elementoST.getLineNumber() + "\n"
                );
            }
        }
    }

}
