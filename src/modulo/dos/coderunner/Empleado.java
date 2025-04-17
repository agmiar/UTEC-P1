package modulo.dos.coderunner;

// Clase base
class Empleado {
    // Método
    public void calcularSalario() {
        System.out.println("Calculando salario de empleado");
    }
}

// Clase derivada
class Programador extends Empleado {
    private int horasTrabajadas;
    private double salario;
    public static int SALARIO_POR_HORA = 900;

    public Programador(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Programador(){
        this(0);
    }

    // Sobreescritura del método para calcular salario de programador
    @Override
    public void calcularSalario(){
        System.out.println("Calculando salario de programador");
        salario = SALARIO_POR_HORA * horasTrabajadas;
//        System.out.println("Salario de programador: " + salario + " pesos");
    }
}

// Clase derivada
class Vendedor extends Empleado {
    private int horasTrabajadas;
    private double salario;
    public static int SALARIO_POR_HORA = 700;
    private int compensacionPorObjetivos;

    public Vendedor(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public Vendedor(){
        this(0);
    }

    // Sobreescritura del método para calcular salario de vendedor
    @Override
    public void calcularSalario(){
        System.out.println("Calculando salario de vendedor");
        compensacionPorObjetivos = SALARIO_POR_HORA * 9;
        salario = horasTrabajadas * SALARIO_POR_HORA + compensacionPorObjetivos;
//        System.out.println("Salario de vendedor: " + salario + " pesos");
    }
}