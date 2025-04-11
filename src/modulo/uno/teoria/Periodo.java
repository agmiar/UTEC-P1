package modulo.uno.teoria;

import java.time.LocalDate;
import java.time.Period;

public class Periodo {
    public static void main(String[] args) {
        LocalDate fechaIndependencia = LocalDate.parse("1825-08-25");
        Period periodo = Period.between(fechaIndependencia, LocalDate.now());
        System.out.println("Han pasado " + periodo.getYears() +
                " años desde la Independencia de Uruguay");
    }
}
