package br.com.ti4b.visao.telas.tables;

import br.com.ti4b.modelo.Movimentacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio Costa
 */
public class TabelaMovimentacao extends AbstractTableModel {

    String colunas[] = {"tipoES", "tipoLD", "destino", "valorArrebatado", "lote", "data"};
    List<Movimentacao> movimentacoes = new ArrayList<>();

    public void addListaMovimentacao(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public void inserirMovimentacaos(List<Movimentacao> movimentacoes) {
        limparLista();
        this.movimentacoes.addAll(movimentacoes);

    }

    public void addMovimentacao(Movimentacao movimentacao) {
        if (movimentacoes == null) {
            movimentacoes = new ArrayList<>();
        }
        this.movimentacoes.add(movimentacao);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Movimentacao getMovimentacao(int index) {
        return movimentacoes.get(index);
    }

    public void limparLista() {
        movimentacoes.clear();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return movimentacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Movimentacao movimentacao = movimentacoes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return movimentacao.getTipoES();
            case 1:
                return movimentacao.getTipoLD();
            case 2:
                return movimentacao.getDestino();
            case 3:
                return movimentacao.getValorArrebatado();
            case 4:
                return movimentacao.getLote();
            case 5:
                return movimentacao.getDataMovimentacao();
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
