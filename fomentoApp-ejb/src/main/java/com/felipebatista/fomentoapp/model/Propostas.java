package com.felipebatista.fomentoapp.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "propostas")
@Table(name = "propostas")
public class Propostas implements Serializable, Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_proposta")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "i_fornecedor")
    private Fornecedores fornecedores;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="i_necessidade",foreignKey = @ForeignKey(name = "fk_necessidades_propostas"))
    private Necessidades necessidades;
    
    @Column(name = "descricao")
    private String descricao;

    @Column(name = "comentario")
    private String comentario;

    @Override
    public Long getId() {
        return this.id;
    }

    public Fornecedores getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }

    public Necessidades getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(Necessidades necessidades) {
        this.necessidades = necessidades;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.fornecedores);
        hash = 23 * hash + Objects.hashCode(this.necessidades);
        hash = 23 * hash + Objects.hashCode(this.descricao);
        hash = 23 * hash + Objects.hashCode(this.comentario);
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
        final Propostas other = (Propostas) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fornecedores, other.fornecedores)) {
            return false;
        }
        if (!Objects.equals(this.necessidades, other.necessidades)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Propostas{" + "id=" + id + ", fornecedores=" + fornecedores + ", necessidades=" + necessidades + ", descricao=" + descricao + ", comentario=" + comentario + '}';
    }

    
}
