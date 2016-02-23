package br.com.ti4b.modelo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diagnostico implements Serializable, Modelo {

    @Id
    private long id;

    private Consulta consulta;

    private String descricao;

    private String tipoDeExame;

    private Date dataDiagnostico;

    private String informacao;

    @Override
    public long getId() {
        return id;
    }

}
