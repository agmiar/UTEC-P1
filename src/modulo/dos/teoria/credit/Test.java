package modulo.dos.teoria.credit;

public class Test {
    public static void main(String[] args) {
        // Crear un array de tarjetas de crédito
        CreditCard billetera[] = new CreditCard[3];
        billetera[0] = new CreditCard("5391 0375 9387 5309", "John Bowman",
                "California Savings", 0.0, 2500);
        billetera[1] = new CreditCard("3485 0399 3395 1954", "John Bowman",
                "California Federal", 0.0, 3500);
        billetera[2] = new CreditCard("6011 4902 3294 2994", "John Bowman",
                "California Finance", 0.0, 5000);

        //
        for (int i = 1; i <= 200; i++){
            billetera[0].comprar(i);
            billetera[1].comprar(2.0*i); // casting implícito
            billetera[2].comprar((double)3*i); // casting explícito
        }

        System.out.println("Pagos de tarjeta:");
        for (int i = 0; i < 3; i++){
            CreditCard.imprimirTarjeta(billetera[i]);
            while(billetera[i].getDisponibleTarjeta() < 100.0){
                billetera[i].pagarTarjeta(100.0);
                System.out.println("Nuevo saldo = " + billetera[i].getDisponibleTarjeta());
            }
            System.out.println();
        }

        for (CreditCard tarjeta : billetera){
            tarjeta.imprimirTarjeta();
        }
    }
}
