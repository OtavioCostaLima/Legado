package br.com.ti4b.visao.telas.tables;

import br.com.ti4b.modelo.Veterinario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio Costa
 */
public class TabelaVeterinario extends AbstractTableModel {

    List<Veterinario> veterinarioes = new ArrayList<>();
    String colunas[] = {"Nome", "Especialidade", "Contrato", "CPF", "Sexo", "Rg", "Endereco", "Bairro", "Cidade", "UF", "Email", "Telefone", "Celular", "Nacionalidade", "Numero Residencia"};

    public void addListaVeterinario(List<Veterinario> veterinarioes) {
        this.veterinarioes = veterinarioes;
    }

    public void inserirVeterinarios(List<Veterinario> veterinarioes) {
        limparLista();
        this.veterinarioes.addAll(veterinarioes);

    }

    public void addVeterinario(Veterinario veterinario) {
        if (veterinarioes == null) {
            veterinarioes = new ArrayList<>();
        }
        this.veterinarioes.add(veterinario);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Veterinario getVeterinario(int index) {
        return veterinarioes.get(index);
    }

    public void limparLista() {
        veterinarioes.clear();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return veterinarioes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veterinario veterinario = veterinarioes.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return veterinario.getNome();
            case 1:
                return veterinario.getEspecialidade();
            case 2:
                return veterinario.getTipoDeContrato();
            case 3:
                return veterinario.getCpf();
            case 4:
                return veterinario.getSexo();
            case 5:
                return veterinario.getRg();
            case 6:
                return veterinario.getEndereco();
            case 7:
                return veterinario.getBairro();
            case 8:
                return veterinario.getCidade();
            case 9:
                return veterinario.getUf();
            case 10:
                return veterinario.getEmail();
            case 11:
                return veterinario.getFone1();
            case 12:
                return veterinario.getCelular();
            case 13:
                return veterinario.getNacionalidade();
            case 14:
                return veterinario.getNumeroResidencia();
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
