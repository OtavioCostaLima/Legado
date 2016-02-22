package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.FornecedorDAO;
import br.com.ti4b.modelo.Fornecedor;

/**
 *
 * @author Otavio Costa
 */
public class FornecedorRN {

    FornecedorDAO fornecedorDAO;

    public boolean cadastrar(Fornecedor fornecedor) {
        fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.cadastrar(fornecedor);
    }

    public boolean atualizar(Fornecedor fornecedor) {
        fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.atualizar(fornecedor);
    }

    public boolean deletar(long id) {
        fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.deletar(id);
    }

    public Fornecedor buscarPorId(long id) {
        fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.buscarPorId(id);
    }

    public java.util.List<Fornecedor> buscarTodos() {
        fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.buscarTodos();
    }
}
