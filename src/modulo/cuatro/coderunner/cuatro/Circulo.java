package modulo.cuatro.coderunner.cuatro;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void dibujar(){
        System.out.println("Dibujando un círculo.");
    }

    public void calcularArea(){
        System.out.printf("Área del círculo: %f\n", Math.PI * radio * radio);
    }
}
