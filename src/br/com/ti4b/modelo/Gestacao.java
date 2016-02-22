package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Gestacao implements Serializable, Modelo {

    @Id
    private long id;

    @OneToOne
    @JoinColumn(name = "id_parto")
    private Fecundacao fecundacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPrevistaParto;

    private String observacao;

    /**
     *
     * @return
     */
    @Override
    public long getId() {
        return id;
    }

    public Fecundacao getFecundacao() {
        return fecundacao;
    }

    public void setFecundacao(Fecundacao fecundacao) {
        this.fecundacao = fecundacao;
    }

    public Date getDataPrevistaParto() {
        return dataPrevistaParto;
    }

    public void setDataPrevistaParto(Date dataPrevistaParto) {
        this.dataPrevistaParto = dataPrevistaParto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
