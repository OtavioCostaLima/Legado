/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ti4b.modelo;

/**
 *
 * @author GEFERSON CAIQUE
 */
public class MateriaPrima {
    
    private int cod_materia ;
    private String descricao;
    private String retorno;

    public int getCod_Materia() {
        return cod_materia;
    }

    public void setCod_Materia(int cod_materia) {
        this.cod_materia = cod_materia;
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
