/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ti4b.modelo;

import java.util.Date;

/**
 *
 * @author hyllorran
 */
public class Vacinas {

    private int cod_vacina;
    private String descricao;
    private int n_licitacao;
    private String lab_fabricante;
    private int lote;
    private String periodo_aplicacao;
    private int quant;
    private double preco_unit;
    private Date data_validade;
    private String retorno;

    public int getCod_vacina() {
        return cod_vacina;
    }

    public void setCod_vacina(int cod_vacina) {
        this.cod_vacina = cod_vacina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getN_licitacao() {
        return n_licitacao;
    }

    public void setN_licitacao(int n_licitacao) {
        this.n_licitacao = n_licitacao;
    }

    public String getLab_fabricante() {
        return lab_fabricante;
    }

    public void setLab_fabricante(String lab_fabricante) {
        this.lab_fabricante = lab_fabricante;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getPeriodo_aplicacao() {
        return periodo_aplicacao;
    }

    public void setPeriodo_aplicacao(String periodo_aplicacao) {
        this.periodo_aplicacao = periodo_aplicacao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco_unit() {
        return preco_unit;
    }

    public void setPreco_unit(double preco_unit) {
        this.preco_unit = preco_unit;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

  

    
}
