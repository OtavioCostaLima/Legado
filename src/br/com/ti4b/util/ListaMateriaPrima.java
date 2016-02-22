/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.util;

import br.com.ti4b.modelo.MateriaPrima;
import br.com.ti4b.dao.MateriaPrimaDAO;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author GC
 */
public class ListaMateriaPrima {

    MateriaPrimaDAO fm = new MateriaPrimaDAO();

    public void listarMateria(JComboBox comboBox, String descricao) {
        try {

            List<MateriaPrima> listaClac = fm.retornaMateria(descricao);
            if (!listaClac.isEmpty()) {
                comboBox.removeAllItems();
                // Classificacao.addItem(null);
                for (int i = 0; i < listaClac.size(); i++) {
                    comboBox.addItem(String.valueOf(listaClac.get(i).getDescricao()));
                    //JCTurnoSerieAluno.addItem(classeSeries.get(i).getTurno());
                }
            } else {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void listarAlimentoConsumido(JComboBox comboBox, String descricao) {
        try {

            List<MateriaPrima> listaClac = fm.retornaMateria(descricao);
            if (!listaClac.isEmpty()) {
                comboBox.removeAllItems();
                // Classificacao.addItem(null);
                for (int i = 0; i < listaClac.size(); i++) {
                    comboBox.addItem(String.valueOf(listaClac.get(i).getDescricao()));
                    //JCTurnoSerieAluno.addItem(classeSeries.get(i).getTurno());
                }
            } else {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int retornaCodMateria(String descricao) {
        int cod = fm.retornaCod_Materia(descricao);
        return cod;
    }
}
