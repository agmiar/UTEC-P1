package modulo.dos.teoria.credit;

public class CreditCard {
    // Variables modelo (de instancia)
    private String number;
    private String name;
    private String bank;
    private double disponibleTarjeta;
    private int limit;

    // Constructor
    public CreditCard(String numero, String nombre, String banco, double disponible, int limite){
        this.number = numero;
        this.name = nombre;
        this.bank = banco;
        this.disponibleTarjeta = disponible;
        this.limit = limite;
    }

    // Métodos getters y setters
    public String getNumber() {return number;}
    public String getName() {return name;}
    public String getBank() {return bank;}
    public double getDisponibleTarjeta() {return disponibleTarjeta;}
    public int getLimit() {return limit;}

    // Métodos de acción
    public boolean comprar(double precio){
        if (precio > disponibleTarjeta)
            return false; // No hay fondos suficientes para hacer la compra
        disponibleTarjeta -= precio;
        return true; // Se acepta la compra
    }

    public void pagarTarjeta(double pago){
        disponibleTarjeta += pago;
    }

    public static void imprimirTarjeta(CreditCard tarjeta){
        // Imprimir la información de la tarjeta de crédito
        System.out.println("Número = " + tarjeta.getNumber());
        System.out.println("Nombre = " + tarjeta.getName());
        System.out.println("Banco = " + tarjeta.getBank());
        System.out.println("Disponible de la tarjeta = " + tarjeta.getDisponibleTarjeta()); // casting implícito
        System.out.println("Limite = " + tarjeta.getLimit()); // casting implícito
    }
}
