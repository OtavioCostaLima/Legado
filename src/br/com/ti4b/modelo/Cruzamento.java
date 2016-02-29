package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Otavio Costa
 */
@Entity
public class Cruzamento implements Serializable, Modelo {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "crmv")
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn(name = "id_matriz")
    private Animal matriz;

    @ManyToOne
    @JoinColumn(name = "id_reprodutor")
    private Animal reprodutor;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCruza;

    private String tipo;

    private String status;

    private String idTipoCruza;

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Animal getMatriz() {
        return matriz;
    }

    public void setMatriz(Animal matriz) {
        this.matriz = matriz;
    }

    public Animal getReprodutor() {
        return reprodutor;
    }

    public void setReprodutor(Animal reprodutor) {
        this.reprodutor = reprodutor;
    }

    public Date getDataCruza() {
        return dataCruza;
    }

    public void setDataCruza(Date dataCruza) {
        this.dataCruza = dataCruza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdTipoCruza() {
        return idTipoCruza;
    }

    public void setIdTipoCruza(String idTipoCruza) {
        this.idTipoCruza = idTipoCruza;
    }

    @Override
    public long getId() {
        return id;
    }

}
