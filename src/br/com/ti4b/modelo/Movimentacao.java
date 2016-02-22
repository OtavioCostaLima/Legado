package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Otavio Costa
 */
@Entity
public class Movimentacao implements Modelo, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //entrada saida
    private String tipoES;

    //leilao ou doacao
    private String tipoLD;

    private String destino;

    private double valorArrebatado;

    private String lote;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataMovimentacao;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    @Override
    public long getId() {
        return id;
    }

    public String getTipoES() {
        return tipoES;
    }

    public void setTipoES(String tipoES) {
        this.tipoES = tipoES;
    }

    public String getTipoLD() {
        return tipoLD;
    }

    public void setTipoLD(String tipoLD) {
        this.tipoLD = tipoLD;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorArrebatado() {
        return valorArrebatado;
    }

    public void setValorArrebatado(double valorArrebatado) {
        this.valorArrebatado = valorArrebatado;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
