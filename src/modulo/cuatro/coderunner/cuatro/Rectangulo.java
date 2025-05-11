package modulo.cuatro.coderunner.cuatro;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void dibujar(){
        System.out.println("Dibujando un rectángulo.");
    }

    public void calcularArea(){
        System.out.printf("Área del rectángulo: %f\n", base * altura);
    }
}
