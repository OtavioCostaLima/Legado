/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author tarcila
 */
@Entity
public class Fecundacao implements Modelo, Serializable {

    @Id
    private long id;
    private Date dataFecundacao;

    @OneToOne
    private Cruzamento cruzamento;

    @Override
    public long getId() {
        return id;
    }

}
