/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ti4b.modelo;

import java.sql.Date;

/**
 *
 * @author GC
 */
public class Producao {
    
    
    private int cod_producao;
    private int cod_classificacao;
    private String categoria;
    private int cod_materia;
    private String descricao_materia;
    private Date data_producao;
    private int quant;
    private String retorno;

    public int getCod_producao() {
        return cod_producao;
    }

    public void setCod_producao(int cod_producao) {
        this.cod_producao = cod_producao;
    }

    public int getCod_classificacao() {
        return cod_classificacao;
    }

    public void setCod_classificacao(int cod_classificacao) {
        this.cod_classificacao = cod_classificacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCod_materia() {
        return cod_materia;
    }

    public void setCod_materia(int cod_materia) {
        this.cod_materia = cod_materia;
    }

    public String getDescricao_materia() {
        return descricao_materia;
    }

    public void setDescricao_materia(String descricao_materia) {
        this.descricao_materia = descricao_materia;
    }

    public Date getData_producao() {
        return data_producao;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    
}
