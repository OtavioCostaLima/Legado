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

@Entity
public class Tratamento implements Modelo, Serializable {

    @Id
    private long id;
    private int cod_diagnostico;
    private int cod_medicamento;
    private Date data_tratamento;
    private int periodo_tratamento;
    private int quant;
    private String descricao;
    private Date data_diagnostico;
    private String informacao;

    @Override
    public long getId() {
        return id;
    }

}
