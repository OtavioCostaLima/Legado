package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Otavio Costa
 */
@Entity
public class Saida  implements Serializable, Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSaida;

    @ManyToOne
    @JoinColumn(name = "lote")
    private Leilao leilao;
   
    private Morte morte;
    
    @OneToOne
    @JoinColumn(name = "idAnimal", nullable = false)
    private Animal animal;

    @Override
    public long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
