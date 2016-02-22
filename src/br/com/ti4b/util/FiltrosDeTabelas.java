/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.util;

import br.com.ti4b.modelo.Cruzamento;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author StreamRead
 */
public class FiltrosDeTabelas {

    List<Cruzamento> n = new ArrayList<>();

    public void removerLinhasTabela(JTable tabela) {
        tabela.setRowSorter(null);
        int j = 0;
        while (tabela.getRowCount() > 0) {
            tabela.remove(j);
        }
    }

    public void Ordenartabela(JTable tabela) {
        AbstractTableModel dtm = (AbstractTableModel) tabela.getModel();
        RowSorter<TableModel> sorter = new TableRowSorter<>(dtm);
        tabela.setRowSorter(sorter);
    }

    public void FiltrarNome(String nome, JTable tabela, int i) {
        if ((nome.length() > 0)) {
            try {
                AbstractTableModel dtm = (AbstractTableModel) tabela.getModel();
                TableRowSorter<TableModel> filtro = new TableRowSorter<>(dtm);
                filtro.setRowFilter(RowFilter.regexFilter(nome, i));
                tabela.setRowSorter(filtro);
            } catch (PatternSyntaxException pse) {
                System.err.println("Erro " + pse.getMessage());
            }
        }
    }

}
