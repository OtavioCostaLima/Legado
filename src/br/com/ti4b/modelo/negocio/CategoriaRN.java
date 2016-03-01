/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo.negocio;

import br.com.ti4b.dao.CategoriaDAO;
import br.com.ti4b.modelo.Categoria;

/**
 *
 * @author Otavio Costa
 */
public class CategoriaRN {

    CategoriaDAO categoriaDAO;

    public boolean cadastrar(Categoria categoria) {
        categoriaDAO = new CategoriaDAO();
        return categoriaDAO.cadastrar(categoria);
    }

    public boolean atualizar(Categoria categoria) {
        categoriaDAO = new CategoriaDAO();
        return categoriaDAO.atualizar(categoria);
    }

    public boolean deletar(long id) {
        categoriaDAO = new CategoriaDAO();
        return categoriaDAO.deletar(id);
    }

    public Categoria buscarPorId(long id) {
        categoriaDAO = new CategoriaDAO();
        return categoriaDAO.buscarPorId(id);
    }

    public Categoria buscarPorDescricao(String descricao) {
        categoriaDAO = new CategoriaDAO();
        return categoriaDAO.buscarPorDescricao(descricao);
    }

    public java.util.List<Categoria> buscarTodos() {
        categoriaDAO = new CategoriaDAO();
        return categoriaDAO.buscarTodos();
    }
}
