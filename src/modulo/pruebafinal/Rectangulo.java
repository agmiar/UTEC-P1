package modulo.pruebafinal;

public class Rectangulo {

    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    // Método calcularArea()
    public double calcularArea(){
        return base * altura;
    }

    // Método calcularPerimetro()
    public double calcularPerimetro(){
        return (base + altura) * 2;
    }

}
