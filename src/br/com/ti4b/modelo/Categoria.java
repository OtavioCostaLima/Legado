package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author StreamRead
 */
@Entity
public class Categoria implements Serializable, Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<SubCategoria> subCategorias;

    @Override
    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<SubCategoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<SubCategoria> subCategorias) {
        this.subCategorias = subCategorias;
    }

}
