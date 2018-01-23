
package com.felipebatista.fomentoapp.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Felipe
 */
@Entity(name="fornecedores")
@Table(name = "fornecedores")
public class Fornecedores implements Serializable,Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_fornecedor")
    private Long id;
        
    @OneToOne
    @JoinColumn(name = "i_usuarios")
    private Usuarios usuario;
    
    @Column(name = "nome")
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private ETipoDocumento tipoDocto;
    
    @Column(name = "cpfCnpj")
    private String documento;
    
    @Column(name = "endereco")
    private String endereco;
    
    @Column(name = "telefone")
    private String telefone;
    
    @Column(name = "email")
    private String email;

    @Column(name = "descricao")
    private String descricao;
    
    @Override
    public Long getId() {
        return this.id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ETipoDocumento getTipoDocto() {
        return tipoDocto;
    }

    public void setTipoDocto(ETipoDocumento tipoDocto) {
        this.tipoDocto = tipoDocto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.usuario);
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.tipoDocto);
        hash = 71 * hash + Objects.hashCode(this.documento);
        hash = 71 * hash + Objects.hashCode(this.endereco);
        hash = 71 * hash + Objects.hashCode(this.telefone);
        hash = 71 * hash + Objects.hashCode(this.email);
        hash = 71 * hash + Objects.hashCode(this.descricao);
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
        final Fornecedores other = (Fornecedores) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }

        return this.tipoDocto != other.tipoDocto;
    }

    @Override
    public String toString() {
        return "Fornecedores{" + "id=" + id + ", usuario=" + usuario + ", nome=" + nome + ", tipoDocto=" + tipoDocto + ", documento=" + documento + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", descricao=" + descricao + '}';
    }

    
    
    
}
