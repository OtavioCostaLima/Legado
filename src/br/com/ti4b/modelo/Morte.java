/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Otavio Costa
 */
public class Morte  implements Serializable, Modelo {

    private long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date dataMorte;
    private String causa;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

}
