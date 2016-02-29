package br.com.ti4b.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author OtavioC
 */
@Entity
public class Animal implements Serializable, Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String idInstituicao;

    @OneToOne
    @JoinColumn(name = "idMae", nullable = true)
    private Animal mae;
    @OneToOne
    @JoinColumn(name = "idPai", nullable = true)
    private Animal pai;

    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<Movimentacao> movimentacao;

    @ManyToOne
    @JoinColumn(name = "idSubCategoria")
    private SubCategoria subCategoria;

    private String nome;

    private String sexo;

    private String raca;

    private String pelagem;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    private float peso;

    private String grauSanguineo;

    private String informacao;

    @Column(name = "circunferencia")
    private String circunferenciaTesticular;

    public String getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(String idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public Animal getMae() {
        return mae;
    }

    public void setMae(Animal mae) {
        this.mae = mae;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Movimentacao> getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(List<Movimentacao> movimentacao) {
        this.movimentacao = movimentacao;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getGrauSanguineo() {
        return grauSanguineo;
    }

    public void setGrauSanguineo(String grauSanguineo) {
        this.grauSanguineo = grauSanguineo;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getCircunferenciaTesticular() {
        return circunferenciaTesticular;
    }

    public void setCircunferenciaTesticular(String circunferenciaTesticular) {
        this.circunferenciaTesticular = circunferenciaTesticular;
    }

    public Animal getPai() {
        return pai;
    }

    public void setPai(Animal pai) {
        this.pai = pai;
    }

    @Override
    public long getId() {
        return id;
    }

}
