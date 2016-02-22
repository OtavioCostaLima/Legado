package br.com.ti4b.modelo;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;

/**
 *
 * @author HELBECY
 */
public class Usuario {

    private int idAcesso;
    private String nome;
    private String nome_usuario;
    private String previlegio;
    private Date data, hora_f;
    private Time hora_a;
    private String retorno;
    private String senha;

    public int getCod_acesso() {
        return idAcesso;
    }

    public void setCod_acesso(int cod_acesso) {
        this.idAcesso = cod_acesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getPrevilegio() {
        return previlegio;
    }

    public void setPrevilegio(String previlegio) {
        this.previlegio = previlegio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora_f() {
        return hora_f;
    }

    public void setHora_f(Date hora_f) {
        this.hora_f = hora_f;
    }

    public Time getHora_a() {
        return hora_a;
    }

    public void setHora_a(Time hora_a) {
        this.hora_a = hora_a;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public final boolean isADM() {
        return Optional.ofNullable(this).map(Usuario::getPrevilegio).equals(Optional.of("ADMINISTRADOR"));
    }
}
