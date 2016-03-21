/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.LeilaoDAO;
import br.com.ti4b.modelo.Leilao;
import java.util.List;

/**
 *
 * @author Otavio Costa
 */
public class LeilaoRN implements RNgenerico<Leilao> {

    private LeilaoDAO leilaoDAO;

    @Override
    public boolean salvar(Leilao t) {
        leilaoDAO = new LeilaoDAO();
        return leilaoDAO.cadastrar(t);
    }

    @Override
    public boolean remover(Long id) {
        leilaoDAO = new LeilaoDAO();
        return leilaoDAO.deletar(id);
    }

    @Override
    public Leilao buscarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Leilao> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
