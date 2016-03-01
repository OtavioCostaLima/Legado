package br.com.ti4b.dao;

import br.com.ti4b.modelo.Modelo;
import br.com.ti4b.util.ConexaoUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Otavio Costa
 * @param <T>
 */
public class DAOGenerico<T extends Modelo> {

    public boolean cadastrar(T t) {
        EntityManager em = ConexaoUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println("erro " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }

    }

    public boolean atualizar(T t) {
        EntityManager em = ConexaoUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println("erro " + e.getMessage());
            return false;
        } finally {
            em.close();
        }
    }

    public boolean deletar(long id) {
        EntityManager em = ConexaoUtil.getEntityManager();
        try {
            T t = em.find((Class<T>) getClazz(), id);
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println("erro " + e.getMessage());
            return false;
        } finally {
            em.close();
        }
    }

    public T buscarPorId(long id) {
        return null;
    }

    public List<T> buscarTodos() {
        EntityManager em = ConexaoUtil.getEntityManager();
        return (List<T>) em.createQuery(("FROM " + getClazz().getName())).getResultList();
    }

    private Class<?> getClazz() {
        return (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
