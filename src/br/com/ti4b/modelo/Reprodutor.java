/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.modelo;

import javax.persistence.Entity;

/**
 *
 * @author Otavio Costa
 */
@Entity
public class Reprodutor extends Animal {

    private double circunferenciaTesticular;

    public Reprodutor() {
    }

    public void setCircunferenciaTesticular(double circunferenciaTesticular) {
        this.circunferenciaTesticular = circunferenciaTesticular;
    }

}
