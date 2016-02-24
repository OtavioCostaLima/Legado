/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author StreamRead
 */
public class Consumo implements Serializable, Modelo {

    private long id;
    private int cod_Classificacao;
    private int cod_Volumoso;
    private int cod_Concentrado;
    private int quantidade;
    private Date data_Consumo;
    private String categoria;
    private String descricao;
    private String retorno;

    @Override
    public long getId() {
        return id;
    }

}
