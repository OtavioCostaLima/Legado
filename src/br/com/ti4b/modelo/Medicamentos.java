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
public class Medicamentos {
    private int cod_medicamento;
    private String desricao;
    private String eficacia;
    private int quant;
    private float preco_unit;
    private Date data_validade;
    private String retorno;

    public int getCod_medicamento() {
        return cod_medicamento;
    }

    public void setCod_medicamento(int cod_medicamento) {
        this.cod_medicamento = cod_medicamento;
    }
    
    public String getDesricao() {
        return desricao;
    }

    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    public String getEficacia() {
        return eficacia;
    }

    public void setEficacia(String eficacia) {
        this.eficacia = eficacia;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public float getPreco_unit() {
        return preco_unit;
    }

    public void setPreco_unit(float preco_unit) {
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
   