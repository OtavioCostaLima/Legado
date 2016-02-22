package br.com.ti4b.util;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConverterDatas {

    public Date converter(JDateChooser chooser) {
        Date date = null;
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String data = (((JTextField) chooser.getDateEditor().getUiComponent()).getText());
        try {
            if (!data.isEmpty()) {
                date = new java.sql.Date(formato.parse(data).getTime());
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "FALHA AO CONVERTER DATA", JOptionPane.ERROR_MESSAGE);
        }
        if (date != null) {
            return date;
        } else {
            return null;
        }

    }

    public String converterString(java.util.Date data) {
        String novaData = null;
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            novaData = formato.format(data);
            return novaData;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "FALHA AO CONVERTER DATA", JOptionPane.ERROR_MESSAGE);
        }
        return novaData;
    }

    public java.sql.Date converterData(String data) {
        java.sql.Date date = null;
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (!data.isEmpty()) {
                date = new java.sql.Date(formato.parse(data).getTime());
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "FALHA AO CONVERTER DATA", JOptionPane.ERROR_MESSAGE);
        }
        if (date != null) {
            return date;
        } else {
            return null;
        }
    }

    public String converterForString(JDateChooser chooser) {
        String date = ((JTextField) chooser.getDateEditor().getUiComponent()).getText();
        if (date != null) {
            return date;
        } else {
            return null;
        }
    }

    public Time converterHora(Calendar c) {
        Time hora = null;
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String hor = formatoHora.format(c.getTime());
        hora = Time.valueOf(hor);
        return hora;

    }

    public Date CalendarForDate(Calendar c) {
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = c.getTime();
        String dat = data.format(date);
        return converterData(dat);
    }
}
