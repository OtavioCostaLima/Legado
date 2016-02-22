package br.com.ti4b.modelo;

import java.sql.Date;

/**
 *
 * @author Geferson Caique
 */
public class Campanha {

    
    private int idCampanha;
    private Animal animal;
    private int cod_animal;
    private int cod_vacina;
    private Date dataAplicacao;
    private int quantidade;
    private String retorno;
    private String nomeAnimal;
    private String descricao;

    public int getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(int idCampanha) {
        this.idCampanha = idCampanha;
    }

    public int getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(int cod_animal) {
        this.cod_animal = cod_animal;
    }

    public int getCod_vacina() {
        return cod_vacina;
    }

    public void setCod_vacina(int cod_vacina) {
        this.cod_vacina = cod_vacina;
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

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

 

}
    