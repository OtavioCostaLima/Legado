package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Otavio Costa
 */
@Entity
public class Leilao implements Serializable, Modelo {

    @Id
    private String lote;

    private String localArrebatamento;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ddataLeilao;

    private double valor;

    private String descricao;

    @OneToMany(mappedBy = "leilao", cascade = CascadeType.ALL)
    private List<Saida> saidas;

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getLocalArrebatamento() {
        return localArrebatamento;
    }

    public void setLocalArrebatamento(String localArrebatamento) {
        this.localArrebatamento = localArrebatamento;
    }

    public Date getDdataLeilao() {
        return ddataLeilao;
    }

    public void setDdataLeilao(Date ddataLeilao) {
        this.ddataLeilao = ddataLeilao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

       public List<Saida> getSaidas() {
        return saidas;
    }

    public void setSaidas(List<Saida> saidas) {
        this.saidas = saidas;
    }

    @Override
    public long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
