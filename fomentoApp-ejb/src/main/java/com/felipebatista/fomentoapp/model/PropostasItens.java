package com.felipebatista.fomentoapp.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Felipe
 */
@Entity(name="propostas_itens")
@Table(name="propostas_itens")
public class PropostasItens implements Serializable,Entidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_itens")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "i_produto")
    private Produtos produto;

    @Column(name = "unidade")
    private String unidade;
    
    @Column(name = "qtde")
    private Integer qtde;
    
    @Column(name = "vlrPagoAtual")
    private Double vlrPagoAtual;
    
    @Override
    public Long getId() {
        return id;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Double getVlrPagoAtual() {
        return vlrPagoAtual;
    }

    public void setVlrPagoAtual(Double vlrPagoAtual) {
        this.vlrPagoAtual = vlrPagoAtual;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.produto);
        hash = 53 * hash + Objects.hashCode(this.unidade);
        hash = 53 * hash + Objects.hashCode(this.qtde);
        hash = 53 * hash + Objects.hashCode(this.vlrPagoAtual);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PropostasItens other = (PropostasItens) obj;
        if (!Objects.equals(this.unidade, other.unidade)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.qtde, other.qtde)) {
            return false;
        }
        if (!Objects.equals(this.vlrPagoAtual, other.vlrPagoAtual)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NecessidadesItens{" + "id=" + id + ", produto=" + produto + ", unidade=" + unidade + ", qtde=" + qtde + ", vlrPagoAtual=" + vlrPagoAtual + '}';
    }

}
