package modulo.dos.coderunner;

// Clase base
class FiguraGeometrica {
    // Atributos
    private String nombre;
    // Constructor
    public FiguraGeometrica(){
        this.nombre = nombre;
    }
    // Método
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    // Método para calcular el área (debe ser sobreescrito por las clases derivadas)
    public void calcularArea(){};
}

// Clase derivada
class Circulo extends FiguraGeometrica {
    // Atributos adicionales
    private double radio;

    // Constructor
    public Circulo(String nombre, double radio){
        this.setNombre(nombre);
        this.radio = radio;
    }

    // Método adicional
    public double getRadio(){
        return this.radio;
    }

    // Sobreescritura del método para calcular el área específico de un círculo
    @Override
    public void calcularArea() {
        // Implementación
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo (" + this.getNombre() + "): " + area);
    }
}

// Clase derivada
class Rectangulo extends FiguraGeometrica {
    // Atributos adicionales
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(String nombre, double base, double altura){
        this.setNombre(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Métodos adicionales
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    // Sobreescritura del método para calcular el área específico de un rectángulo
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo (" + this.getNombre() + "): " + area);
    }
}


