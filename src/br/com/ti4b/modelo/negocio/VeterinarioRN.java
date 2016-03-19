package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.VeterinarioDAO;
import br.com.ti4b.modelo.Veterinario;

/**
 *
 * @author Otavio Costa
 */
public class VeterinarioRN {

    VeterinarioDAO veterinarioDAO;

    public boolean cadastrar(Veterinario veterinario) {
        veterinarioDAO = new VeterinarioDAO();
        return veterinarioDAO.cadastrar(veterinario);
    }

    public boolean atualizar(Veterinario veterinario) {
        veterinarioDAO = new VeterinarioDAO();
        return veterinarioDAO.atualizar(veterinario);
    }

    public boolean deletar(long id) {
        veterinarioDAO = new VeterinarioDAO();
        return veterinarioDAO.deletar(id);
    }
    public boolean deletar(String crmv) {
        veterinarioDAO = new VeterinarioDAO();
        return veterinarioDAO.deletar(crmv);
    }

    public Veterinario buscarPorId(long id) {
        veterinarioDAO = new VeterinarioDAO();
        return veterinarioDAO.buscarPorId(id);
    }

    public java.util.List<Veterinario> buscarTodos() {
        veterinarioDAO = new VeterinarioDAO();
        return veterinarioDAO.buscarTodos();
    }

}
