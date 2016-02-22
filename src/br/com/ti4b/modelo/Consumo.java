/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.sql.Date;

/**
 *
 * @author StreamRead
 */
public class Consumo {

    private int cod_Consumo;
    private int cod_Classificacao;
    private int cod_Volumoso;
    private int cod_Concentrado;
    private int quantidade;
    private Date data_Consumo;
    private String categoria;
    private String descricao;
    private String retorno;

    public int getCod_Consumo() {
        return cod_Consumo;
    }

    public void setCod_Consumo(int cod_Consumo) {
        this.cod_Consumo = cod_Consumo;
    }

    public int getCod_Classificacao() {
        return cod_Classificacao;
    }

    public void setCod_Classificacao(int cod_Classificacao) {
        this.cod_Classificacao = cod_Classificacao;
    }

    public int getCod_Volumoso() {
        return cod_Volumoso;
    }

    public void setCod_Volumoso(int cod_Volumoso) {
        this.cod_Volumoso = cod_Volumoso;
    }

    public int getCod_Concentrado() {
        return cod_Concentrado;
    }

    public void setCod_Concentrado(int cod_Concentrado) {
        this.cod_Concentrado = cod_Concentrado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_Consumo() {
        return data_Consumo;
    }

    public void setData_Consumo(Date data_Consumo) {
        this.data_Consumo = data_Consumo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    

}
