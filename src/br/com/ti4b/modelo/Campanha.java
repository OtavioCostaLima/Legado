package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Geferson Caique
 */
public class Campanha implements Serializable, Modelo {

    private long id;
    private Animal animal;

    private Vacinas vacinas;

    private Date dataAplicacao;

    private int quantidade;

    private String descricao;

    @Override
    public long getId() {
        return id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vacinas getVacinas() {
        return vacinas;
    }

    public void setVacinas(Vacinas vacinas) {
        this.vacinas = vacinas;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
