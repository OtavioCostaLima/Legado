package br.com.ti4b.modelo;

import java.sql.Date;

/**
 *
 * @author GC
 */
public class Consulta {
    
    private int cod_consulta;
     private int cod_animal;
     private String crmv;
     private String nome_veterinario;
     private String nome_animal;
    private Date data_consulta;
    private String tipo_exame_encam;
    private String informacao;
    private String retorno;

    public int getCod_consulta() {
        return cod_consulta;
    }

    public void setCod_consulta(int cod_consulta) {
        this.cod_consulta = cod_consulta;
    }

    public int getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(int cod_animal) {
        this.cod_animal = cod_animal;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getNome_veterinario() {
        return nome_veterinario;
    }

    public void setNome_veterinario(String nome_veterinario) {
        this.nome_veterinario = nome_veterinario;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public Date getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getTipo_exame_encam() {
        return tipo_exame_encam;
    }

    public void setTipo_exame_encam(String tipo_exame_encam) {
        this.tipo_exame_encam = tipo_exame_encam;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

   
    
    
    
}
