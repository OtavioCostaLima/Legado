package br.com.ti4b.modelo;

public class Nascimento {

    private int cod_nascimento;
    private int cod_parto;
    private int cod_instituicao;
    private float peso_nasc;
    private float peso_desmana;
    private float circunferencia_testicular;
    private Parto parto;
    private String retorno;

    public int getCod_nascimento() {
        return cod_nascimento;
    }

    public void setCod_nascimento(int cod_nascimento) {
        this.cod_nascimento = cod_nascimento;
    }

    public int getCod_parto() {
        return cod_parto;
    }

    public void setCod_parto(int cod_parto) {
        this.cod_parto = cod_parto;
    }

    public int getCod_instituicao() {
        return cod_instituicao;
    }

    public void setCod_instituicao(int cod_instituicao) {
        this.cod_instituicao = cod_instituicao;
    }

    public float getPeso_nasc() {
        return peso_nasc;
    }

    public void setPeso_nasc(float peso_nasc) {
        this.peso_nasc = peso_nasc;
    }

    public float getPeso_desmana() {
        return peso_desmana;
    }

    public void setPeso_desmana(float peso_desmana) {
        this.peso_desmana = peso_desmana;
    }

    public float getCircunferencia_testicular() {
        return circunferencia_testicular;
    }

    public void setCircunferencia_testicular(float circunferencia_testicular) {
        this.circunferencia_testicular = circunferencia_testicular;
    }

    public Parto getParto() {
        return parto;
    }

    public void setParto(Parto parto) {
        this.parto = parto;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

}
