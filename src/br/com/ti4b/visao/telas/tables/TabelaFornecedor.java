/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.telas.tables;

import br.com.ti4b.modelo.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio Costa
 */
public class TabelaFornecedor extends AbstractTableModel {

    List<Fornecedor> fornecedores = new ArrayList<>();
    String colunas[] = {"nome", "cnpj", "nomeProprietario", "descricao", "endereco", "bairro", "cidade", "uf", "email", "Telefone 1", "Telefone 2", "Numero Licitacao", "numero"};

    public void addListaFornecedor(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public void inserirFornecedors(List<Fornecedor> fornecedores) {
        limparLista();
        this.fornecedores.addAll(fornecedores);

    }

    public void addFornecedor(Fornecedor fornecedor) {
        if (fornecedores == null) {
            fornecedores = new ArrayList<>();
        }
        this.fornecedores.add(fornecedor);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Fornecedor getFornecedor(int index) {
        return fornecedores.get(index);
    }

    public void limparLista() {
        fornecedores.clear();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return fornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = fornecedores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return fornecedor.getNome();
            case 1:
                return fornecedor.getCnpj();
            case 2:
                return fornecedor.getNomeProprietario();
            case 3:
                return fornecedor.getDescricao();
            case 4:
                return fornecedor.getEndereco();
            case 5:
                return fornecedor.getBairro();
            case 6:
                return fornecedor.getCidade();
            case 7:
                return fornecedor.getUf();
            case 8:
                return fornecedor.getEmail();
            case 9:
                return fornecedor.getFone1();
            case 10:
                return fornecedor.getFone2();
            case 11:
                return fornecedor.getFone2();
            case 12:
                return fornecedor.getNumeroLicitacao();
            case 13:
                return fornecedor.getNumero();
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
