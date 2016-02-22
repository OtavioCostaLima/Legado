package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Parto implements Modelo, Serializable {

    @Id
    private long id;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataParto;
    private int quantidadeCrias;
    private String infomacoes;

    @OneToOne(mappedBy = "fecundacao", cascade = CascadeType.ALL)
    private Gestacao gestacao;

    @Override
    public long getId() {
        return id;
    }

    public Date getDataParto() {
        return dataParto;
    }

    public void setDataParto(Date dataParto) {
        this.dataParto = dataParto;
    }

    public int getQuantidadeCrias() {
        return quantidadeCrias;
    }

    public void setQuantidadeCrias(int quantidadeCrias) {
        this.quantidadeCrias = quantidadeCrias;
    }

    public String getInfomacoes() {
        return infomacoes;
    }

    public void setInfomacoes(String infomacoes) {
        this.infomacoes = infomacoes;
    }

    public Gestacao getGestacao() {
        return gestacao;
    }

    public void setGestacao(Gestacao gestacao) {
        this.gestacao = gestacao;
    }

}
