package br.com.ti4b.visao.telas.tables;

import br.com.ti4b.modelo.Entrada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio Costa
 */
public class TabelaEntrada extends AbstractTableModel {

    String colunas[] = {"Entrada", "Descricao", "Local", "Lote", "valorArrebatado", "Data Leilão"};
    List<Entrada> entradas = new ArrayList<>();

    public void addListaMovimentacao(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public void inserirMovimentacaos(List<Entrada> entradas) {
        limparLista();
        this.entradas.addAll(entradas);

    }

    public void addMovimentacao(Entrada movimentacao) {
        if (entradas == null) {
            entradas = new ArrayList<>();
        }
        this.entradas.add(movimentacao);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Entrada getEntrada(int index) {
        return entradas.get(index);
    }

    public void limparLista() {
        entradas.clear();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return entradas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Entrada entrada = entradas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return entrada.getDataEntrada();
            case 1:
                return entrada.getLeilao().getDescricao();
            case 2:
                return entrada.getLeilao().getLocalArrebatamento();
            case 3:
                return entrada.getLeilao().getLote();
            case 4:
                return entrada.getLeilao().getValor();
            case 5:
                return entrada.getLeilao().getDdataLeilao();
            case 6:
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
