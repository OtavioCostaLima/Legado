package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.MedicamentoDAO;
import br.com.ti4b.modelo.Medicamento;
import java.util.List;

/**
 *
 * @author Otavio Costa
 */
public class MedicamentoRN implements RNgenerico<Medicamento> {

    MedicamentoDAO medicamentoDAO;

    @Override
    public boolean salvar(Medicamento t) {
        medicamentoDAO = new MedicamentoDAO();
        return medicamentoDAO.cadastrar(t);
    }

    @Override
    public boolean remover(Long id) {
        medicamentoDAO = new MedicamentoDAO();
        return medicamentoDAO.deletar(id);

    }

    @Override
    public Medicamento buscarPorId(Long id) {
        medicamentoDAO = new MedicamentoDAO();
        return medicamentoDAO.buscarPorId(id);
    }

    @Override
    public List<Medicamento> buscarTodos() {
        medicamentoDAO = new MedicamentoDAO();
        return medicamentoDAO.buscarTodos();
    }

}
