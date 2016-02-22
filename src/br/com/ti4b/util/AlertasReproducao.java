package br.com.ti4b.util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 *
 * @author StreamRead
 */
public class AlertasReproducao {

    public boolean isParto(String dataParto, String Categoria) {
        long diferencaEmDias = 0;
        boolean ret = false;
        ConverterDatas cd = new ConverterDatas();
        LocalDate hoje = LocalDate.now();
        Calendar calendar = Calendar.getInstance();
        Date date = cd.converterData(dataParto);

        if ((date.compareTo(cd.CalendarForDate(calendar))) < 0) {
            LocalDate localDate = LocalDate.parse(dataParto);
            // Calcula a diferença de dias entre as duas datas
            diferencaEmDias = ChronoUnit.DAYS.between(localDate, hoje);

        }

        if (Categoria.equals("BOVINO")) {
            if (diferencaEmDias == 284) {
                ret = true;
            }

        } else if (Categoria.equals("OVINO")) {
            if (diferencaEmDias == 100) {
                ret = true;
            }
        } else if (Categoria.equals("CAPRINO")) {
            if (diferencaEmDias == 151) {
                ret = true;
            }

        } else if (Categoria.equals("SUÍNO")) {
            if (diferencaEmDias == 112) {
                ret = true;
            }

        } else {
            ret = false;
        }
        return ret;
    }

}
