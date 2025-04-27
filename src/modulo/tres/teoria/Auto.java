package modulo.tres.teoria;

public class Auto {
    private String patente;
    private String modelo;
    private String titular;

    public Auto(String patente, String modelo, String titular) {
        this.patente = patente;
        this.modelo = modelo;
        this.titular = titular;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTitular() {
        return titular;
    }
}
