package com.felipebatista.fomentoapp.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Felipe
 */
@Entity(name = "produtos")
@Table(name = "produtos")
public class Produtos implements Serializable,Entidade{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_produtos")
    private Long id;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Override
    public Long getId() {
        return this.id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.descricao);
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
        final Produtos other = (Produtos) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Produtos{" + "id=" + id + ", descricao=" + descricao + '}';
    }
    
}
