package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.SaidaDAO;
import br.com.ti4b.modelo.Saida;
import java.util.List;

/**
 *
 * @author Otavio Costa
 */
public class SaidaRN implements RNgenerico<Saida> {

    SaidaDAO saida;

    @Override
    public boolean salvar(Saida t) {
        saida = new SaidaDAO();
        return saida.cadastrar(t);
    }

    @Override
    public boolean remover(Long id) {
        saida = new SaidaDAO();
        return saida.deletar(id);
    }

    @Override
    public Saida buscarPorId(Long id) {
        saida = new SaidaDAO();
        return saida.buscarPorId(id);
    }

    @Override
    public List<Saida> buscarTodos() {
        saida = new SaidaDAO();
        return saida.buscarTodos();
    }

}
