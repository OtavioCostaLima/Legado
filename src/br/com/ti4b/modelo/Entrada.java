package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Otavio Costa
 */
@Entity
public class Entrada implements Serializable, Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrada;

    @OneToMany(mappedBy = "entrada", cascade = CascadeType.ALL)
    private List<Animal> animais;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lote")
    private Leilao leilao;

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
