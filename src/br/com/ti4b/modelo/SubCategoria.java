/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author StreamRead
 */
@Entity
public class SubCategoria implements Modelo, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    private String descricao;

    private int idadeInicio;
    private int idadedoFim;

    @Override
    public long getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdadeInicio() {
        return idadeInicio;
    }

    public void setIdadeInicio(int idadeInicio) {
        this.idadeInicio = idadeInicio;
    }

    public int getIdadedoFim() {
        return idadedoFim;
    }

    public void setIdadedoFim(int idadedoFim) {
        this.idadedoFim = idadedoFim;
    }

}
