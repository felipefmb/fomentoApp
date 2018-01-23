package com.felipebatista.fomentoapp.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "necessidades")
@Table(name = "necessidades")
public class Necessidades implements Serializable, Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_necessidade")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "i_cliente")
    private Clientes cliente;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    @JoinColumn(name = "i_necessidades")
    private List<NecessidadesItens> itens;

    @Column(name = "comentario")
    private String comentario;
    

    @Override
    public Long getId() {
        return this.id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<NecessidadesItens> getItens() {
        return itens;
    }

    public void setItens(List<NecessidadesItens> itens) {
        this.itens = itens;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.cliente);
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + Objects.hashCode(this.itens);
        hash = 37 * hash + Objects.hashCode(this.comentario);
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
        final Necessidades other = (Necessidades) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
       
        return Objects.equals(this.itens, other.itens);
    }

    @Override
    public String toString() {
        return "Necessidades{" + "id=" + id + ", cliente=" + cliente + ", descricao=" + descricao + ", itens=" + itens + ", comentario=" + comentario + '}';
    }

}
