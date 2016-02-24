/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.io.Serializable;

/**
 *
 * @author GC
 */
public class Doencas implements Serializable, Modelo {

    private long id;
    private String descricao;
    private String retorno;

    @Override
    public long getId() {
        return id;
    }

}
