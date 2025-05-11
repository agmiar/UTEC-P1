package modulo.cuatro.coderunner.uno;

public class Suma implements OperacionMatematica {
    @Override
    public double ejecutar(double a, double b){
        return a + b;
    }
}
