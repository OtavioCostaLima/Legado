/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Vacinas implements Serializable, Modelo {

    @Id
    private long id;

    private String descricao;

    private int numeroLicitacao;

    private String laboratorioFabricante;

    private int lote;

    private String periodoAplicacao;

    private int quantidade;

    private double precoUnitario;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataValidade;

    @Override
    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroLicitacao() {
        return numeroLicitacao;
    }

    public void setNumeroLicitacao(int numeroLicitacao) {
        this.numeroLicitacao = numeroLicitacao;
    }

    public String getLaboratorioFabricante() {
        return laboratorioFabricante;
    }

    public void setLaboratorioFabricante(String laboratorioFabricante) {
        this.laboratorioFabricante = laboratorioFabricante;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getPeriodoAplicacao() {
        return periodoAplicacao;
    }

    public void setPeriodoAplicacao(String periodoAplicacao) {
        this.periodoAplicacao = periodoAplicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

}
