/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.MovimentacaoDAO;
import br.com.ti4b.modelo.Movimentacao;

/**
 *
 * @author Otavio Costa
 */
public class MovimentacaoRN {
      MovimentacaoDAO movimentacaoDAO;

    public boolean cadastrar(Movimentacao movimentacao) {
        movimentacaoDAO = new MovimentacaoDAO();
        return movimentacaoDAO.cadastrar(movimentacao);
    }

    public boolean atualizar(Movimentacao movimentacao) {
        movimentacaoDAO = new MovimentacaoDAO();
        return movimentacaoDAO.atualizar(movimentacao);
    }

    public boolean deletar(long id) {
        movimentacaoDAO = new MovimentacaoDAO();
        return movimentacaoDAO.deletar(id);
    }

    public Movimentacao buscarPorId(long id) {
        movimentacaoDAO = new MovimentacaoDAO();
        return movimentacaoDAO.buscarPorId(id);
    }

    public java.util.List<Movimentacao> buscarTodos() {
        movimentacaoDAO = new MovimentacaoDAO();
        return movimentacaoDAO.buscarTodos();
    }

}
