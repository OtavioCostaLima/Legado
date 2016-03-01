package br.com.ti4b.dao;

import br.com.ti4b.modelo.Categoria;
import br.com.ti4b.util.ConexaoUtil;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author StreamRead
 */
public class CategoriaDAO extends DAOGenerico<Categoria> {

    public Categoria buscarPorDescricao(String descricao) {
        EntityManager entityManager = ConexaoUtil.getEntityManager();
        String consulta = "SELECT c FROM Categoria c WHERE c.descricao=:descricao";
        TypedQuery<Categoria> query = entityManager.createQuery(consulta, Categoria.class);
        query.setParameter("descricao", descricao);
        return query.getSingleResult();
    }
}
