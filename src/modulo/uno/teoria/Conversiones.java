package modulo.uno.teoria;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Conversiones {
    public static void main(String[] args) {
        Date fechaDate = new Date();
        System.out.println(convertirDateALocalDate(fechaDate));
    }

    public static LocalDate convertirDateALocalDate(Date fechaLegacy){
        return fechaLegacy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
