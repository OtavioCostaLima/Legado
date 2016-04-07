/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.telas.tables;

import br.com.ti4b.modelo.Saida;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio Costa
 */
public class TabelaSaida extends AbstractTableModel {

    String colunas[] = {"id", "Registro", "Animal", "Data Saída", "Destino", "Descricao", "lote"};
    List<Saida> saidas = new ArrayList<>();

    public void addListaMovimentacao(List<Saida> saidas) {
        this.saidas = saidas;
    }

    public void inserirMovimentacaos(List<Saida> saidas) {
        limparLista();
        this.saidas.addAll(saidas);

    }

    public void addMovimentacao(Saida movimentacao) {
        if (saidas == null) {
            saidas = new ArrayList<>();
        }
        this.saidas.add(movimentacao);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Saida getSaida(int index) {
        return saidas.get(index);
    }

    public void limparLista() {
        saidas.clear();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return saidas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Saida saida = saidas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return saida.getId();
            case 1:
                return saida.getAnimal().getIdInstituicao();
            case 2:
                return saida.getAnimal().getNome();
            case 3:
                return saida.getDataSaida();
            case 4:
                return saida.getDestino();
            case 5:
                return saida.getDescricao();
            case 6:
                return saida.getLeilao().getLote();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}
