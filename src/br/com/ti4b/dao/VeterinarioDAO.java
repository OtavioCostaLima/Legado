package br.com.ti4b.dao;

import br.com.ti4b.modelo.Veterinario;
import br.com.ti4b.util.ConexaoUtil;
import javax.persistence.EntityManager;

public class VeterinarioDAO extends DAOGenerico<Veterinario> {

    public boolean deletar(String crmv) {
        EntityManager manager = ConexaoUtil.getEntityManager();
        try {

            Veterinario veterinario = manager.find(Veterinario.class, crmv);
            manager.getTransaction().begin();
            manager.remove(veterinario);
            manager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
        }
        return false;
    }
}
