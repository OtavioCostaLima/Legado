/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.AlimentoDAO;
import br.com.ti4b.modelo.Alimento;

/**
 *
 * @author Otavio Costa
 */
public class AlimentoRN {

    AlimentoDAO alimentoDAO;

    public boolean cadastrar(Alimento alimento) {
        alimentoDAO = new AlimentoDAO();
        return alimentoDAO.cadastrar(alimento);
    }

    public boolean atualizar(Alimento alimento) {
        alimentoDAO = new AlimentoDAO();
        return alimentoDAO.atualizar(alimento);
    }

    public boolean deletar(long id) {
        alimentoDAO = new AlimentoDAO();
        return alimentoDAO.deletar(id);
    }

    public Alimento buscarPorId(long id) {
        alimentoDAO = new AlimentoDAO();
        return alimentoDAO.buscarPorId(id);
    }

    public java.util.List<Alimento> buscarTodos() {
        alimentoDAO = new AlimentoDAO();
        return alimentoDAO.buscarTodos();
    }

}
