package br.com.ti4b.util;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author StreamRead
 */
public class ConverteIdade {

    /**
     * @param idade
     * @return
     */
    public String retornaNumeroIdade(String idade) {
        String anterior = "";
        String proximo = "";
        String retorno = "";
        for (int i = 0; i < (idade).length(); i++) {
            String letra = ((idade).substring(i, i + 1));
            anterior = anterior + letra;
            if (letra.equals(" ")) {
                retorno = anterior.trim();
            }
        }
        return retorno;
    }

    public String retornaDMA(String idade) {
        String anterior = "";
        String proximo = "";
        int retorno = 0;
        for (int i = 0; i < (idade).length(); i++) {
            String letra = ((idade).substring(i, i + 1));
            anterior = anterior + letra;
            if (letra.equals(" ")) {
                proximo = ((idade).substring(i, idade.length()).trim());
            }
        }
        return proximo;
    }

    public String retornaIdadeAnimal(JDateChooser jDateChooser) {
        String idade = null;
        try {
            idade = null;
            ConverterDatas cd = new ConverterDatas();
            LocalDate hoje = LocalDate.now();

            Calendar calendar = Calendar.getInstance();
            String dataNascimento = cd.converterForString(jDateChooser);
            Date date = cd.converter(jDateChooser);
            if ((date.compareTo(cd.CalendarForDate(calendar))) < 0) {

                LocalDate localDate = LocalDate.parse(dataNascimento);
                // Calcula a diferença de dias entre as duas datas
                long diferencaEmDias = ChronoUnit.DAYS.between(localDate, hoje);
                // Calcula a diferença de meses entre as duas datas
                long diferencaEmMes = ChronoUnit.MONTHS.between(localDate, hoje);
                // Calcula a diferença de anos entre as duas datas F
                long diferencaEmAnos = ChronoUnit.YEARS.between(localDate, hoje);

                if (diferencaEmDias != 0) {
                    idade = diferencaEmDias + " Dia(s)";
                }
                if (diferencaEmMes != 0) {
                    idade = diferencaEmMes + " Mês(es)";
                }
                if (diferencaEmAnos != 0) {
                    idade = diferencaEmAnos + " Ano(s)";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar converter Idade " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return idade;
    }

    public String retornaIdadeAnimal(Date data1) {
        String idade = null;
        try {
            idade = null;
            ConverterDatas cd = new ConverterDatas();
            LocalDate hoje = LocalDate.now();
            Calendar calendar = Calendar.getInstance();
            String dataNascimento = cd.converterString(data1);
            if ((data1.compareTo(cd.CalendarForDate(calendar))) < 0) {

                LocalDate localDate = LocalDate.parse(dataNascimento);
                // Calcula a diferença de dias entre as duas datas
                long diferencaEmDias = ChronoUnit.DAYS.between(localDate, hoje);
                // Calcula a diferença de meses entre as duas datas
                long diferencaEmMes = ChronoUnit.MONTHS.between(localDate, hoje);
                // Calcula a diferença de anos entre as duas datas F
                long diferencaEmAnos = ChronoUnit.YEARS.between(localDate, hoje);

                if (diferencaEmDias != 0) {
                    idade = diferencaEmDias + " Dia(s)";
                }
                if (diferencaEmMes != 0) {
                    idade = diferencaEmMes + " Mês(es)";
                }
                if (diferencaEmAnos != 0) {
                    idade = diferencaEmAnos + " Ano(s)";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar converter Idade " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return idade;
    }

}
