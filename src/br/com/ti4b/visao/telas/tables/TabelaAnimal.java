package br.com.ti4b.visao.telas.tables;

import br.com.ti4b.modelo.Animal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio Costa
 */
public class TabelaAnimal extends AbstractTableModel {

    List<Animal> animais = new ArrayList<>();
    String colunas[] = {"idInstituicao", "nome", "subCategoria", "sexo", "raca", "pelagem", "idade", "dataNascimento", "peso", "grauSanguineo", "informacao"};

    public void addListaAnimal(List<Animal> animais) {
        this.animais = animais;
    }

    public void inserirAnimals(List<Animal> animais) {
        limparLista();
        this.animais.addAll(animais);

    }

    public void addAnimal(Animal animal) {
        if (animais == null) {
            animais = new ArrayList<>();
        }
        this.animais.add(animal);
        fireTableRowsInserted(getRowCount(), getRowCount() - 1);
    }

    public Animal getAnimal(int index) {
        return animais.get(index);
    }

    public void limparLista() {
        animais.clear();
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return animais.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = animais.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return animal.getIdInstituicao();
            case 1:
                return animal.getNome();
            case 2:
                return animal.getSubCategoria().getDescricao();
            case 3:
                return animal.getSexo();
            case 4:
                return animal.getRaca();
            case 5:
                return animal.getPelagem();
            case 6:
                return animal.getIdade();
            case 7:
                return animal.getDataNascimento();
            case 8:
                return animal.getPeso();
            case 9:
                return animal.getGrauSanguineo();
            case 10:
                return animal.getInformacao();
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
