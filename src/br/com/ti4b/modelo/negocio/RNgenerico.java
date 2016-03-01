package br.com.ti4b.modelo.negocio;


import br.com.ti4b.modelo.Modelo;
import java.util.List;

/**
 *
 * @author Otavio Costa
 * @param <T>
 */
public interface RNgenerico<T extends Modelo> {

    boolean salvar(T t);

    boolean remover(Long id);
    
        T buscarPorId(Long id);

    List<T> buscarTodos();
}
