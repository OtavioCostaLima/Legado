/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.EntradaDAO;
import br.com.ti4b.modelo.Entrada;
import java.util.List;

/**
 *
 * @author Otavio Costa
 */
public class EntradaRN implements RNgenerico<Entrada> {

    EntradaDAO entradaDAO;

    @Override
    public boolean salvar(Entrada t) {
        entradaDAO = new EntradaDAO();
        return entradaDAO.cadastrar(t);

    }

    @Override
    public boolean remover(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entrada buscarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entrada> buscarTodos() {
   entradaDAO = new EntradaDAO();
    return entradaDAO.buscarTodos();
    }

}
