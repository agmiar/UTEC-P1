package modulo.uno.teoria;

import java.time.LocalDate;

public class Fecha {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        fecha = LocalDate.of(2020, 3, 1);
        fecha = LocalDate.parse("2020-05-01");
        fecha = fecha.plusDays(1);
        fecha = fecha.minusDays(1);
        fecha = fecha.withDayOfMonth(10);
        fecha = fecha.minusMonths(1);
        fecha = fecha.plusMonths(1);
        fecha = fecha.withMonth(5);
        fecha = fecha.minusYears(1);
        fecha = fecha.plusYears(1);
        fecha = fecha.withYear(2020);

        LocalDate fecha2 = LocalDate.parse("2050-10-12");
        boolean b = fecha.isAfter(fecha2);
        boolean c = fecha.isBefore(fecha2);
    }
}

